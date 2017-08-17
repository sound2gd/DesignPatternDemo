## 设计模式之责任链模式

	责任链模式的介绍:有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，
	请求在这条链上传递，直到某一对象决定处理该请求。但是发出者并不清楚到底最终
	那个对象会处理该请求。
	
	所以，责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整。

以上，来自大话设计模式,此外,本设计模式demo来自 [北京尚学堂](http://www.bjsxt.com)

画图讲解:

![](http://7xox4k.com1.z0.glb.clouddn.com/Chain.png)

首先，责任链找到第一个负责任的Filter，开始执行作业，
然后第一个Filter作业完，把担子扔回给责任链，责任链找到下一个Filter，
下一个Filter开始执行作业，然后把担子扔回给责任链。直到责任链里所有的
已注册的Filter都执行完毕，这个模式才算完成

