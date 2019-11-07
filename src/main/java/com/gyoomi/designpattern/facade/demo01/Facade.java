package com.gyoomi.designpattern.facade.demo01;

/**
 * 门面类
 *
 * @author Leon
 * @version 2019/11/7 21:25
 */
public class Facade {

    /**
     * 被委托的对象
     */

    private ClassA classA = new ClassA();

    private ClassB classB = new ClassB();

    private ClassC classC = new ClassC();

    /**
     * 提供给外部的接口
     */

    public void methodA() {
        this.classA.doSomethingA();
    }

    public void methodB() {
        this.classB.doSomethingB();
    }

    public void methodC() {
        this.classC.doSomethingC();
    }

}
