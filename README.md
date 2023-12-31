# 设计模式
# 1.单例模式
保持系统只有这个类的一个实例，单例模式分为饿汉氏单例和懒汉氏单例，里面还会涉及到双重检验机制，枚举是实现单例的最好方式。
具体的创建方式见代码。
# 2.简单工厂模式
![image](https://github.com/EcustCaoHao/designPattern/assets/114331779/f61efe77-4770-4a0f-be2c-c309c3886bf2)
+ 将创建对象的任务交给工厂来实现
# 3.工厂方法模式
简单工厂方法的缺点：新增一个手机品牌需要需要修改工厂类，不符合OCP原则。
工厂方法模式就是一个产品对应一个工厂（苹果工厂生产苹果手机 安卓工厂生产安卓手机）。
# 4.代理模式
可以在不改变原始类代码的情况下，通过引入代理类来增强原始类的附加功能。
代理模式的好处：
+ 不让其他类直接访问原始类，保证了安全性。
+ 在调用原始类的方法时可以对原有的方法做增强。
## 4.1静态代理
我们就使用缓存代理来进行说明。详细见代码。
### 4.1.1第一个案例是缓存代理的例子
### 4.1.2第二个案例是安全代理的例子
## 4.2动态代理
静态代理的实现需要：
+ 手动编写代理类。
+ 代理类和被代理类实现相同的接口。
+ 在程序运行前，代理类的代码就已经生成了。
### 4.2.1JDK动态代理
基于JDK的动态代理是基于反射机制的，需要使用Proxy类和InvocationHandler类。
### 4.2.2CGlib动态代理
基于CGlib的动态代理需要使用Enhancer类和MethodInterceptor接口。
## 4.3总结
如果被代理类是一个接口，建议使用基于JDK的动态代理，spring里面就是这么做的。如果被代理类没有实现接口，那就采用基于CGlib的动态代理。


