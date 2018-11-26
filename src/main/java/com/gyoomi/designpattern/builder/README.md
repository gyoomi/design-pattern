## 建造者模式（生成器模式）
### 一、定义
1. 建造者模式又叫生成器模式。其<font color='red'>**将一个复杂的对象的构建和它的表示分离，使得同样的构建过程可以创建不同的表示。**</font>(Separate the construction of a complex object from its representation so that the same
                                                                         ​    ​    ​    construction process can create different representations.)
2. 建造者通用类图结构
![结构](./assets/111.png)
- Product产品类
  通常是模板方法来实现抽象的产品类。如BenzCarModel和BWMModel都是具体的产品类

- Builder抽象的建造者

  规范产品的组建，一般由子类来实现。如CarBuilder类

- ConcreteBuilder具体的建造者

  实现抽象类定义的所有方法，并且返回一个组建好的对象。例子中的BenzBuilder和
  BMWBuilder就属于具体建造者。

- Direction导演者

  负责安排已有模块的顺序，然后告诉Builder开始建造，在上面的例子中就是我们的老
  大，××公司找到老大，说我要这个或那个类型的车辆模型，然后老大就把命令传递给我，我
  和我的团队就开始拼命地建造，于是一个项目建设完毕了。
### 二、示例

#### 1.产品类

抽象的产品类：

```
public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected abstract void stop();

    public final void run() {
        sequence.forEach(s -> {
            if ("start".equals(s)) {
                this.start();
            } else if ("alarm".equals(s)) {
                this.alarm();
            } else if ("engineBoom".equals(s)) {
                this.engineBoom();
            } else if ("stop".equals(s)){
                this.stop();
            }
        });
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
```

具体的产品实现类：

```
public class BenzCarModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("奔驰车启动了...");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车鸣笛了...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎启动了...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止了...");
    }
}

```



```
public class BWMModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马启动了...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马鸣笛了...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎启动了...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停止了...");
    }
}
```

#### 2.抽象创建者

```
public abstract class CarBuilder {

    public abstract void setSequence(List<String> sequence);

    public abstract CarModel getCarModel();
}

```

#### 3.具体的创建者

奔驰具体创建者：

```
public class BenzCarBuilder extends CarBuilder {

    private BenzCarModel benzCarModel = new BenzCarModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.benzCarModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzCarModel;
    }
}
```

宝马具体创建者：

```
public class BWMModelBuilder extends CarBuilder {

    private BWMModel bwmModel = new BWMModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.bwmModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bwmModel;
    }
}

```

需要注意的是：如果有多个产品类，就需要有多个创建者，而且这多个产品类有相同的抽象类或接口。如上。


### 三、应用和总结