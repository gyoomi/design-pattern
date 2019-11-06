## java与设计模式-抽象工厂模式

### 一、定义

抽象工厂模式（Abstract Factory Pattern） 是一种比较常用的模式， 其定义如下：

Provide an interface for creating families of related or dependent objects without specifying
their concrete classes.（为创建一组相关或相互依赖的对象提供一个接口， 而且无须指定它们的具体类。 ）

### 二、通用类图

![](./asserts/001.png)

### 三、角色分析

抽象工厂模式是工厂方法模式的升级版本， 在有多个业务品种、 业务分类时， 通过抽象
工厂模式产生需要的对象是一种非常好的解决方式。 我们来看看抽象工厂的通用源代码， 首
先有两个互相影响的产品线（也叫做产品族） ， 例如制造汽车的左侧门和右侧门， 这两个应
该是数量相等的——两个对象之间的约束， 每个型号的车门都是不一样的， 这是产品等级结
构约束的， 我们先看看两个产品族的类图。

![](./asserts/002.png)


注意类图上的圈圈、 框框相对应， 两个抽象的产品类可以有关系， 例如共同继承或实现一个抽象类或接口。

**抽象产品类**
**具体的产品实现类**
**抽象工厂类**

抽象工厂类的职责是定义每个工厂要实现的功能， 在通用代码中， 抽象工厂类定义了两个产品族的产品创建。_有N个产品族， 在抽象工厂类中就应该有N个创建方法。_

**具体工厂类**

如何创建一个产品， 则是由具体的实现类来完成的。有M个产品等级就应该有M个实现工厂类， 在每个实现工厂中， 实现不同产品族的生产任务。

### 四、经典源码实现

**抽象产品类**

```java
public abstract class AbstractProductA {

    /**
     * 每个产品共有的方法
     */
    public void shareMethod() {
        System.out.println("Product A common method...");
    }

    /**
     * 每个产品相同的方法，不同的方法实现
     */
    public abstract void doSomething();
    
}

public abstract class AbstractProductB {

    /**
     * 每个产品共有的方法
     */
    public void shareMethod() {
        System.out.println("Product B common method...");
    }

    /**
     * 每个产品相同的方法，不同的方法实现
     */
    public abstract void doSomething();

}
```

**具体产品类**

```java
public class ProductA1 extends AbstractProductA {

    @Override
    public void doSomething() {
        System.out.println("Product A1 的实现方法...");
    }
}
```

```java
public class ProductA2 extends AbstractProductA {

    @Override
    public void doSomething() {
        System.out.println("Product A2 的实现方法...");
    }
}
```

```java
public class ProductB1 extends AbstractProductB {

    @Override
    public void doSomething() {
        System.out.println("Product B1 的实现方法...");
    }
}

public class ProductB2 extends AbstractProductB {

    @Override
    public void doSomething() {
        System.out.println("Product B2 的实现方法...");
    }
}

```

**抽象工厂类**

```java
public abstract class AbstractFactory {

    // 有N个产品族， 在抽象工厂类中就应该有N个创建方法

    /**
     * 创建A产品家族
     *
     * @return A产品
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建B产品家族
     *
     * @return B产品
     */
    public abstract AbstractProductB createProductB();

}
```

**具体工厂类**

```java
/**
 * 产品等级1的实现类
 *
 * @author Leon
 * @date 2019-11-06 8:58
 */
public class Factory01 extends AbstractFactory {

    /**
     * 只生产产品等级为1的A产品
     *
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    /**
     * 只生产产品等级为1的B产品
     *
     * @return
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
```

```java
/**
 * 产品等级1的实现类
 *
 * @author Leon
 * @date 2019-11-06 8:58
 */
public class Factory02 extends AbstractFactory {

    /**
     * 只生产产品等级为2的A产品
     *
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    /**
     * 只生产产品等级为2的B产品
     *
     * @return
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
```

**场景类**

```java
/**
 * 在场景类中， 没有任何一个方法与实现类有关系， 对于一个产品来说， 我们只要知道它
 * 的工厂方法就可以直接产生一个产品对象， 无须关心它的实现类。
 *
 * @author Leon
 * @date 2019-11-06 9:24
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory01 = new Factory01();
        AbstractFactory factory02 = new Factory02();

        // 产生A1
        AbstractProductA productA1 = factory01.createProductA();
        // 产生A2
        AbstractProductA productA2 = factory02.createProductA();
        // 产生B1
        AbstractProductB productB1 = factory01.createProductB();
        // 产生B2
        AbstractProductB productB2 = factory02.createProductB();

        // 拿着生成的具体的产品进行操作...
    }
}
```

### 五、抽象工厂模式的应用

**5.1 抽象工厂模式的优点**

- 封装性， 每个产品的实现类不是高层模块要关心的， 它要关心的是什么？ 是接口， 是
  抽象， 它不关心对象是如何创建出来， 这由谁负责呢？ 工厂类， 只要知道工厂类是谁， 我就
  能创建出一个需要的对象， 省时省力， 优秀设计就应该如此。

- 产品族内的约束为非公开状态。 

**5.2 抽象工厂模式的缺点**

抽象工厂模式的最大缺点就是产品族扩展非常困难， 为什么这么说呢？ 我们以通用代码
为例， 如果要增加一个产品C， 也就是说产品家族由原来的2个增加到3个， 看看我们的程序
有多大改动吧！ 抽象类AbstractCreator要增加一个方法createProductC()， 然后两个实现类都要
修改， 想想看， 这严重违反了开闭原则， 而且我们一直说明抽象类和接口是一个契约。 改变
契约， 所有与契约有关系的代码都要修改， 那么这段代码叫什么？ 叫“有毒代码”， ——只要
与这段代码有关系， 就可能产生侵害的危险！

**5.3 抽象工厂模式的使用场景**

抽象工厂模式的使用场景定义非常简单： 一个对象族（或是一组没有任何关系的对象）
都有相同的约束， 则可以使用抽象工厂模式。 什么意思呢？ 例如一个文本编辑器和一个图片处理器， 都是软件实体， 但是*nix下的文本编辑器和Windows下的文本编辑器虽然功能和界
面都相同， 但是代码实现是不同的， 图片处理器也有类似情况。 也就是具有了共同的约束条件： 操作系统类型。 于是我们可以使用抽象工厂模式， 产生不同操作系统下的编辑器和图片处理器。

**5.4 抽象工厂模式的注意事项**

在抽象工厂模式的缺点中， 我们提到抽象工厂模式的产品族扩展比较困难， 但是一定要清楚， 是产品族扩展困难， 而不是产品等级。 在该模式下， 产品等级是非常容易扩展的， 增
加一个产品等级， 只要增加一个工厂类负责新增加出来的产品生产任务即可。 也就是说横向扩展容易， 纵向扩展困难。 以人类为例子， 产品等级中只有男、 女两个性别， 现实世界还有
一种性别： 双性人， 既是男人也是女人（俗语就是阴阳人） ， 那我们要扩展这个产品等级也是非常容易的， 增加三个产品类， 分别对应不同的肤色， 然后再创建一个工厂类， 专门负责
不同肤色人的双性人的创建任务， 完全通过扩展来实现需求的变更， 从这一点上看， 抽象工厂模式是符合开闭原则的。

**5.5 最佳实践**

一个模式在什么情况下才能够使用， 是很多读者比较困惑的地方。 抽象工厂模式是一个简单的模式， 使用的场景非常多， 大家在软件产品开发过程中， 涉及不同操作系统的时候，
都可以考虑使用抽象工厂模式， 例如一个应用， 需要在三个不同平台（Windows、 Linux、Android（Google发布的智能终端操作系统） ） 上运行， 你会怎么设计？ 分别设计三套不同
的应用？ 非也， 通过抽象工厂模式屏蔽掉操作系统对应用的影响。 三个不同操作系统上的软件功能、 应用逻辑、 UI都应该是非常类似的， 唯一不同的是调用不同的工厂方法， 由不同的
产品类去处理与操作系统交互的信息。





































































