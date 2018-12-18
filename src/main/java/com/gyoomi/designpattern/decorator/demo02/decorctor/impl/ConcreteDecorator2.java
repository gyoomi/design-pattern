/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.decorator.demo02.decorctor.impl;

import com.gyoomi.designpattern.decorator.demo02.component.Component;
import com.gyoomi.designpattern.decorator.demo02.decorctor.Decorator;

/**
 * 具体的装饰类2
 *
 * @author Leon
 * @version 2018/12/18 17:26
 */
public class ConcreteDecorator2 extends Decorator {


    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
        System.out.println("附加功能2：run");
    }
}
