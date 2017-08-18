### 中介者模式(Mediator)

目标: 定义一个对象，该对象包装了一堆对象之间如何交互的细节。中介者模式将一堆对象从显式相互引用之间解耦，让他们相互独立的交互

![](http://java-design-patterns.com/patterns/mediator/etc/mediator_1.png)

应用: 以下场景适合使用中介者模式
- 一堆对象以定义良好但是十分复杂的方式通信，他们之间的相互依赖是非结构化的，难以理解的
- 重用对象十分困难，因为他引用了和通信了一堆其他对象
- 一个分布在多个类之间的行为应该可定制化,并且不衍生出一堆子类

实例:
- java.util.Timer的scheduleXXX()方法
- java.util.concurrent.Executor#execute
- java.util.concurrent.ExecutorService的submit()和invokeXXX()
- java.lang.reflect.Method的invoke()方法
