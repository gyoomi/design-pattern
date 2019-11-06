/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.demo02.product;

import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.AbstractProductA;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-11-05 16:46
 */
public class ProductA2 extends AbstractProductA {

    @Override
    public void doSomething() {
        System.out.println("Product A2 的实现方法...");
    }
}
