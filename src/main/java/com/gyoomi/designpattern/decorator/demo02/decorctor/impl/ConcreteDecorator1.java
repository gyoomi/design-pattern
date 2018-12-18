/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.decorator.demo02.decorctor.impl;

import com.gyoomi.designpattern.decorator.demo02.component.Component;
import com.gyoomi.designpattern.decorator.demo02.decorctor.Decorator;

/**
 * 具体的装饰类1
 *
 * @author Leon
 * @version 2018/12/18 17:24
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }


    @Override
    public void operate() {
        System.out.println("附加功能1：run");
        super.operate();
    }
}
