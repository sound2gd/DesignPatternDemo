;; clj实现的命令模式
;; 函数式的写法和OO的写法不一样，状态不放在对象内部维护

;; 目标对象
(def goblin (atom {:size :medium
                   :visibility :visible}))

;; undo日志
(def undo-log (atom []))
;; redo日志
(def redo-log (atom []))

(defn shrink
  "缩小目标"
  [target]
  (let [size (condp = (:size @target)
               :small :small
               :medium :small
               :large :medium)]
    (swap! target assoc :size size)))

(defn enlarge [target]
  (let [size (condp = (:size @target)
               :small :medium
               :medium :large
               :large :large)]
    (swap! target assoc :size size)))

(defn shrink-spell [undo-log target]
  (swap! undo-log conj :shrink-spell)
  (shrink target))

(defn enlarge-spell [undo-log target]
  (swap! undo-log conj :enlarge-spell)
  (enlarge target))

(defn redo-last-spell [undo-log redo-log target]
  (when-let [spell (last @redo-log)]
    (dosync
     (swap! redo-log pop)
     (swap! undo-log conj spell)
     (condp = spell
       :shrink-spell (shrink-spell undo-log target)
       :enlarge-spell (enlarge-spell undo-log target)))))

(defn undo-last-spell
  [undo-log redo-log target]
  (when-let [spell (last @undo-log)]
    (dosync
     (swap! undo-log pop)
     (swap! redo-log conj spell)
     (condp = spell
       :shrink-spell (enlarge-spell undo-log target)
       :enlarge-spell (shrink-spell undo-log target)))))


;; 测试
(do
  (shrink-spell undo-log goblin)
  (println @goblin)
  (undo-last-spell undo-log redo-log goblin)
  (println @goblin)
  (redo-last-spell undo-log redo-log goblin)
  (println @goblin))
