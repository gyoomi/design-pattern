## java与设计模式-观察者模式

### 一、定义

观察者模式（Observer Pattern） 也叫做发布订阅模式（Publish/subscribe） ,它是一个在项
目中经常使用的模式， 其定义如下：

Define a one-to-many dependency between objects so that when one object changes state,all its
dependents are notified and updated automatically.（定义对象间一种一对多的依赖关系， 使得每
当一个对象改变状态， 则所有依赖于它的对象都会得到通知并被自动更新。 ）

### 二、通用类图

![](./asserts/001.png)


### 三、角色分析

- Subject被观察者
定义被观察者必须实现的职责， 它必须能够动态地增加、 取消观察者。 它一般是抽象类
或者是实现类， 仅仅完成作为被观察者必须实现的职责： 管理观察者并通知观察者。

- Observer观察者
观察者接收到消息后， 即进行update（更新方法） 操作， 对接收到的信息进行处理。

- ConcreteSubject具体的被观察者
定义被观察者自己的业务逻辑， 同时定义对哪些事件进行通知.

- ConcreteObserver具体的观察者
每个观察在接收到消息后的处理反应是不同， 各个观察者有自己的处理逻辑。


### 四、经典代码实现

**Observer观察者**

观察者一般是一个接口， 每一个实现该接口的实现类都是具体观察者。

```java
public interface Observer {

    /**
     * 更新方法
     */
    void update();
}
```

**Observer具体观察者1**

```java
public class ConcreteObserver01 implements Observer {


    @Override
    public void update() {
        System.out.println("间谍-01：观察到被观察者有变化，通知上级...");
    }
}
```

**Observer具体观察者2**

```java
public class ConcreteObserver02 implements Observer {


    @Override
    public void update() {
        System.out.println("间谍-02：观察到被观察者有变化，通知上级...");
    }
}
```

**被观察者**

被观察者的职责非常简单， 就是定义谁能够观察， 谁不能观察， 程序中使用ArrayList和Vector没有太大的差别， ArrayList是线程异步， 不安全； Vector是线程同步， 安全——就这点
区别。 我们再来看具体的被观察者。

```java
public abstract class Subject {

    /**
     * 观察者列表
     */
    private Vector<Observer> observers = new Vector<>();

    /**
     * 添加观察者
     *
     * @param observer 观察者
     */
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }


    /**
     * 删除观察者
     *
     * @param observer 观察者
     */
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * 通知所有观察者
     *
     */
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }

}

```


**具体被观察者**

```java
public class ConcreteSubject extends Subject {

    public void doSomething() {
        System.out.println("具体被观察者: 我进行了一些计算活动...");
        super.notifyObserver();
    }
}

```

**场景类**

```java
public class Main {

    public static void main(String[] args) {
        ConcreteSubject cs = new ConcreteSubject();
        ConcreteObserver01 co1 = new ConcreteObserver01();
        ConcreteObserver02 co2 = new ConcreteObserver02();

        cs.addObserver(co1);
        cs.addObserver(co2);
        cs.doSomething();
    }
}
```

运行结果：

```text
具体被观察者: 我进行了一些计算活动...
间谍-01：观察到被观察者有变化，通知上级...
间谍-02：观察到被观察者有变化，通知上级...
```

### 五、观察者模式的应用与理解

**5.1 观察者模式的优点**
- 观察者和被观察者之间是抽象耦合
如此设计， 则不管是增加观察者还是被观察者都非常容易扩展， 而且在Java中都已经实
现的抽象层级的定义， 在系统扩展方面更是得心应手

- 建立一套触发机制
根据单一职责原则， 每个类的职责是单一的， 那么怎么把各个单一的职责串联成真实世
界的复杂的逻辑关系呢？ 比如， 我们去打猎， 打死了一只母鹿， 母鹿有三个幼崽， 因失去了
母鹿而饿死， 尸体又被两只秃鹰争抢， 因分配不均， 秃鹰开始斗殴， 然后羸弱的秃鹰死掉，
生存下来的秃鹰， 则因此扩大了地盘……这就是一个触发机制， 形成了一个触发链。 观察者
模式可以完美地实现这里的链条形式。

**5.2 观察者模式的缺点**

观察者模式需要考虑一下开发效率和运行效率问题， 一个被观察者， 多个观察者， 开发
和调试就会比较复杂， 而且在Java中消息的通知默认是顺序执行， 一个观察者卡壳， 会影响
整体的执行效率。 在这种情况下， 一般考虑采用异步的方式。

多级触发时的效率更是让人担忧， 大家在设计时注意考虑。

**5.3 观察者模式的使用场景**

- 关联行为场景。 需要注意的是， 关联行为是可拆分的， 而不是“组合”关系。
- 事件多级触发场景。
- 跨系统的消息交换场景， 如消息队列的处理机制

**5.3 观察者模式的注意事项**

使用观察者模式也有以下两个重点问题要解决.

- 广播链的问题
>如果你做过数据库的触发器， 你就应该知道有一个触发器链的问题， 比如表A上写了一
个触发器， 内容是一个字段更新后更新表B的一条数据， 而表B上也有个触发器， 要更新表
C， 表C也有触发器……完蛋了， 这个数据库基本上就毁掉了！ 我们的观察者模式也是一样
的问题， 一个观察者可以有双重身份， 既是观察者， 也是被观察者， 这没什么问题呀， 但是
链一旦建立， 这个逻辑就比较复杂， 可维护性非常差， 根据经验建议， 在一个观察者模式中
最多出现一个对象既是观察者也是被观察者， 也就是说消息最多转发一次（传递两次） ， 这
还是比较好控制的。

>注意 它和责任链模式的最大区别就是观察者广播链在传播的过程中消息是随时更改
的， 它是由相邻的两个节点协商的消息结构； 而责任链模式在消息传递过程中基本上保持消
息不可变， 如果要改变， 也只是在原有的消息上进行修正。

- 异步处理问题
>这个EJB是一个非常好的例子， 被观察者发生动作了， 观察者要做出回应， 如果观察者
比较多， 而且处理时间比较长怎么办？ 那就用异步呗， 异步处理就要考虑线程安全和队列的
问题， 这个大家有时间看看Message Queue， 就会有更深的了解。

**5.4 观察者模式的扩展**

Java世界中的观察者模式

Java从一开始诞生就提供了一个可扩展的父类，即java.util.Observable， 这个类就是为那些“暴露狂”准备的， 他们老是喜欢把自己的状态变更
让别人去欣赏， 去触发。 我们打开Java的帮助文件看看， 查找一下Observable是不是已
经有这个类了？ JDK中提供了:java.util.Observable实现类和java.util.Observer接口， 也就是说
我们上面写的那个例子中的Observable接口可以改换成java.util.Observale实现类了。

```java
public class Observable {
    private boolean changed = false;
    private Vector<Observer> obs;

    /** Construct an Observable with zero Observers. */

    public Observable() {
        obs = new Vector<>();
    }

    /**
     * Adds an observer to the set of observers for this object, provided
     * that it is not the same as some observer already in the set.
     * The order in which notifications will be delivered to multiple
     * observers is not specified. See the class comment.
     *
     * @param   o   an observer to be added.
     * @throws NullPointerException   if the parameter o is null.
     */
    public synchronized void addObserver(Observer o) {
        if (o == null)
            throw new NullPointerException();
        if (!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    /**
     * Deletes an observer from the set of observers of this object.
     * Passing <CODE>null</CODE> to this method will have no effect.
     * @param   o   the observer to be deleted.
     */
    public synchronized void deleteObserver(Observer o) {
        obs.removeElement(o);
    }

    /**
     * If this object has changed, as indicated by the
     * <code>hasChanged</code> method, then notify all of its observers
     * and then call the <code>clearChanged</code> method to
     * indicate that this object has no longer changed.
     * <p>
     * Each observer has its <code>update</code> method called with two
     * arguments: this observable object and <code>null</code>. In other
     * words, this method is equivalent to:
     * <blockquote><tt>
     * notifyObservers(null)</tt></blockquote>
     *
     * @see     java.util.Observable#clearChanged()
     * @see     java.util.Observable#hasChanged()
     * @see     java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * If this object has changed, as indicated by the
     * <code>hasChanged</code> method, then notify all of its observers
     * and then call the <code>clearChanged</code> method to indicate
     * that this object has no longer changed.
     * <p>
     * Each observer has its <code>update</code> method called with two
     * arguments: this observable object and the <code>arg</code> argument.
     *
     * @param   arg   any object.
     * @see     java.util.Observable#clearChanged()
     * @see     java.util.Observable#hasChanged()
     * @see     java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void notifyObservers(Object arg) {
        /*
         * a temporary array buffer, used as a snapshot of the state of
         * current Observers.
         */
        Object[] arrLocal;

        synchronized (this) {
            /* We don't want the Observer doing callbacks into
             * arbitrary code while holding its own Monitor.
             * The code where we extract each Observable from
             * the Vector and store the state of the Observer
             * needs synchronization, but notifying observers
             * does not (should not).  The worst result of any
             * potential race-condition here is that:
             * 1) a newly-added Observer will miss a
             *   notification in progress
             * 2) a recently unregistered Observer will be
             *   wrongly notified when it doesn't care
             */
            if (!changed)
                return;
            arrLocal = obs.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
    }

    /**
     * Clears the observer list so that this object no longer has any observers.
     */
    public synchronized void deleteObservers() {
        obs.removeAllElements();
    }

    /**
     * Marks this <tt>Observable</tt> object as having been changed; the
     * <tt>hasChanged</tt> method will now return <tt>true</tt>.
     */
    protected synchronized void setChanged() {
        changed = true;
    }

    /**
     * Indicates that this object has no longer changed, or that it has
     * already notified all of its observers of its most recent change,
     * so that the <tt>hasChanged</tt> method will now return <tt>false</tt>.
     * This method is called automatically by the
     * <code>notifyObservers</code> methods.
     *
     * @see     java.util.Observable#notifyObservers()
     * @see     java.util.Observable#notifyObservers(java.lang.Object)
     */
    protected synchronized void clearChanged() {
        changed = false;
    }

    /**
     * Tests if this object has changed.
     *
     * @return  <code>true</code> if and only if the <code>setChanged</code>
     *          method has been called more recently than the
     *          <code>clearChanged</code> method on this object;
     *          <code>false</code> otherwise.
     * @see     java.util.Observable#clearChanged()
     * @see     java.util.Observable#setChanged()
     */
    public synchronized boolean hasChanged() {
        return changed;
    }

    /**
     * Returns the number of observers of this <tt>Observable</tt> object.
     *
     * @return  the number of observers of this object.
     */
    public synchronized int countObservers() {
        return obs.size();
    }
}
```

```java
public interface Observer {
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param   o     the observable object.
     * @param   arg   an argument passed to the <code>notifyObservers</code>
     *                 method.
     */
    void update(Observable o, Object arg);
}
```

**5.5 项目中真实的观察者模式**

为什么要说“真实”呢？ 因为我们刚刚讲的那些是太标准的模式了， 在系统设计中会对观
察者模式进行改造或改装， 主要在以下3个方面.

- 观察者和被观察者之间的消息沟通

被观察者状态改变会触发观察者的一个行为， 同时会传递一个消息给观察者， 这是正确
的， 在实际中一般的做法是： 观察者中的update方法接受两个参数， 一个是被观察者， 一个
是DTO（Data Transfer Object， 据传输对象） ， DTO一般是一个纯洁的JavaBean,由被观察者
生成， 由观察者消费。

当然， 如果考虑到远程传输， 一般消息是以XML或JSON格式传递。

- 观察者响应方式

我们这样来想一个问题， 观察者是一个比较复杂的逻辑， 它要接受被观察者传递过来的
信息， 同时还要对他们进行逻辑处理， 在一个观察者多个被观察者的情况下， 性能就需要提
到日程上来考虑了， 为什么呢？ 如果观察者来不及响应， 被观察者的执行时间是不是也会被
拉长？ 那现在的问题就是： 观察者如何快速响应？ 有两个办法： 一是采用多线程技术， 甭管
是被观察者启动线程还是观察者启动线程， 都可以明显地提高系统性能， 这也就是大家通常
所说的异步架构； 二是缓存技术， 甭管你谁来， 我已经准备了足够的资源给你了， 我保证快
速响应， 这当然也是一种比较好方案， 代价就是开发难度很大， 而且压力测试要做的足够充
分， 这种方案也就是大家说的同步架构。

- 被观察者尽量自己做主

这是什么意思呢？ 被观察者的状态改变是否一定要通知观察者呢？ 不一定吧， 在设计的
时候要灵活考虑， 否则会加重观察者的处理逻辑， 一般是这样做的， 对被观察者的业务逻辑
doSomething方法实现重载， 如增加一个doSomething(boolean isNotifyObs)方法， 决定是否通知
观察者， 而不是在消息到达观察者时才判断是否要消费.

**5.6 订阅发布模型**

观察者模式也叫做发布/订阅模型（Publish/Subscribe） ， 如果你做过EJB（Enterprise
JavaBean） 的开发， 这个你绝对不会陌生。 EJB2是个折腾死人不偿命的玩意儿， 写个Bean要
实现， 还要继承， 再加上那一堆的配置文件， 小项目还凑合， 你要知道用EJB开发的基本上
都不是小项目， 到最后是每个项目成员都在骂EJB这个忽悠人的东西； 但是EJB3是个非常优
秀的框架， 还是算比较轻量级， 写个Bean只要加个Annotaion就成了， 配置文件减少了， 而且
也引入了依赖注入的概念， 虽然只是EJB2的翻版， 但是毕竟还是前进了一步。 在EJB中有3
个类型的Bean: Session Bean、 Entity Bean和MessageDriven Bean， 我们这里来说一下
MessageDriven Bean（一般简称为MDB） ， 消息驱动Bean， 消息的发布者（Provider） 发布一
个消息， 也就是一个消息驱动Bean， 通过EJB容器（一般是Message Queue消息队列） 通知订
阅者做出回应， 从原理上看很简单， 就是观察者模式的升级版， 或者说是观察则模式的
BOSS版。

### 六、最佳实践

观察者模式在实际项目和生活中非常常见， 我们举几个经常发生的例子来说明.

- 文件系统

比如， 在一个目录下新建立一个文件， 这个动作会同时通知目录管理器增加该目录， 并
通知磁盘管理器减少1KB的空间， 也就说“文件”是一个被观察者， “目录管理器”和“磁盘管理
器”则是观察者。

- 猫鼠游戏

夜里猫叫一声， 家里的老鼠撒腿就跑， 同时也吵醒了熟睡的主人， 这个场景中， “猫”就
是被观察者， 老鼠和人则是观察者。

- ATM取钱

比如你到ATM机器上取钱， 多次输错密码， 卡就会被ATM吞掉， 吞卡动作发生的时
候， 会触发哪些事件呢？ 第一， 摄像头连续快拍， 第二， 通知监控系统， 吞卡发生； 第三，
初始化ATM机屏幕， 返回最初状态。 一般前两个动作都是通过观察者模式来完成的， 后一个
动作是异常来完成。

- 广播收音机

电台在广播， 你可以打开一个收音机， 或者两个收音机来收听， 电台就是被观察者， 收
音机就是观察者。




















































