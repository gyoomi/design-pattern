/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.demo02.product;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-11-05 16:43
 */
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
