## java与设计模式-模板方法模式

### 一、模板方法模式的定义
模板方法模式（Template Method Pattern）其定义如下：

Define the skeleton of an algorithm in an operation,deferring some steps to subclasses.Template
Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's
structure.（定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改
变一个算法的结构即可重定义该算法的某些特定步骤。）


### 二、模板方法模式的通用类图
![](./asserts/001.png)

### 三、分析
1. 抽象模板

模板方法模式确实非常简单，仅仅使用了Java的继承机制，但它是一个应用非常广泛的
模式。其中，AbstractClass叫做抽象模板，它的方法分为两类：

- 基本方法
  >基本方法也叫做基本操作，是由子类实现的方法，并且在模板方法被调用。
- 模板方法
  >可以有一个或几个，一般是一个具体方法，也就是一个框架，实现对基本方法的调度，
   完成固定的逻辑。
   
  **注意**：
  >为了防止恶意的操作，一般模板方法都加上final关键字，不允许被覆写。
  
2. 具体模板

在类图中还有一个角色：具体模板。ConcreteClass1和ConcreteClass2属于具体模板，实
现父类所定义的一个或多个抽象方法，也就是父类定义的基本方法在子类中得以实现。

### 四、示例Demo
1. 抽象模板

   ```
   public abstract class AbstractClass {
   
       /**
        * 基本方法
        */
       protected abstract void doSomething();
   
       /**
        * 基本方法
        */
       protected abstract void doAnything();
   
       /**
        * 模板方法
        */
       public final void templateMethod() {
           this.doSomething();
           this.doAnything();
       }
   }

   ```
2. 具体模板
   - 模板1
     ```
     public class ConcreteClass01 extends AbstractClass {
     
         @Override
         protected void doSomething() {
             System.out.println("ConcreteClass01 doSomething...");
         }
     
         @Override
         protected void doAnything() {
             System.out.println("ConcreteClass01 doAnything...");
         }
     }
     ```
     
   - 模板2
     
     ```
     public class ConcreteClass02 extends AbstractClass {
     
     
         @Override
         protected void doSomething() {
             System.out.println("ConcreteClass02 doSomething");
         }
     
         @Override
         protected void doAnything() {
             System.out.println("ConcreteClass02 doAnything");
         }
     }
     ```
     
3. 测试使用
   
   ```
   public class Main {
   
       public static void main(String[] args) throws Exception {
           AbstractClass concrete1 = new ConcreteClass01();
           AbstractClass concrete2 = new ConcreteClass02();
           concrete1.templateMethod();
           System.out.println("************");
           concrete2.templateMethod();
       }
   }
   ```
   
   运行结果
   
   ```
   ConcreteClass01 doSomething...
   ConcreteClass01 doAnything...
   ************
   ConcreteClass02 doSomething
   ConcreteClass02 doAnything
   ```
   
   注意：
   >抽象模板中的基本方法尽量设计为protected类型，符合迪米特法则，不需要暴露
    的属性或方法尽量不要设置为protected类型。实现类若非必要，尽量不要扩大父类中的访问
    权限。
### 五、模板方法模式的应用
1. 模板方法模式的优点
   - 封装不变部分，扩展可变部分
     >把认为是不变部分的算法封装到父类实现，而可变部分的则可以通过继承来继续扩展。
   - 提取公共部分代码，便于维护
     >我们例子中刚刚走过的弯路就是最好的证明，如果我们不抽取到父类中，任由这种散乱
      的代码发生，想想后果是什么样子？维护人员为了修正一个缺陷，需要到处查找类似的代
      码！
   - 行为由父类控制，子类实现
     >基本方法是由子类实现的，因此子类可以通过扩展的方式增加相应的功能，符合开闭原
      则。
2. 模板方法模式的缺点
   - 按照我们的设计习惯，抽象类负责声明最抽象、最一般的事物属性和方法，实现类完成
     具体的事物属性和方法。但是模板方法模式却颠倒了，抽象类定义了部分抽象方法，由子类
     实现，子类执行的结果影响了父类的结果，也就是子类对父类产生了影响，这在复杂的项目
     中，会带来代码阅读的难度，而且也会让新手产生不适感。
3. 模板方法模式的使用场景
   - 多个子类有公有的方法，并且逻辑基本相同时
   - 重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个
     子类实现。
   - 重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通
     过钩子函数（见“模板方法模式的扩展”）约束其行为。
### 六、模板方法模式的扩展

也就是说外界条件改变，影响到模板方法的执行。在我们的抽象类中isAlarm的返回值就是影响了模板方法的执行结
果，该方法就叫做钩子方法（Hook Method）。有了钩子方法模板方法模式才算完美，大家
可以想想，由子类的一个方法返回值决定公共部分的执行结果，是不是很有吸引力呀！

参考demo02.

### 七、模板方法模式的使用
1. Spring与模板方法模式
2. MyBatis与模板方法模式
   Executor模块的构建。
3. Servlet
4. 其他






























