## [行为型]命令模式

目的:将请求包装成一个对象， 从而让客户端提供不同的请求,参数化队列或日志请求,并且支持取消操作。

类图:![](http://java-design-patterns.com/patterns/command/etc/command.png)

应用:
- 使用一个操作对象来作为参数,在过程式语言里，这往往就是一个callback,command模式是OO语言中对callback的一种替代品
- 在不同的时期指定操作，添加操作入队列，和执行操作,如果操作和原始的请求完全独立，那么就可以放到另一个线程或者进程里去完成操作(java.lang.Runnable)
- 支持undo.操作对象可以保存状态并且在某个时候可以将操作undo.这要求Command对象必须将undo操作实现,
- 支持记录日志变更。这样即使系统崩溃也可以重放日志以恢复系统状态(mysql binlog)
- 使用原子操作来构建高层的抽象操作

典型用例:
- 保存请求历史
- 实现callback功能
- 实现undo功能

实例:
- java.lang.Runnable
- Netflix Hystrix
- javax.swing.com.sound2gd.mediator.Action

参考:
[java-design-pattern/command](http://java-design-patterns.com/patterns/command/)
