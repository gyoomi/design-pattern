/**
 * Copyright © 2019, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.template.demo01;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/2 15:58
 */
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
