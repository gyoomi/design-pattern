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
 * @version 2019/4/2 14:09
 */
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
