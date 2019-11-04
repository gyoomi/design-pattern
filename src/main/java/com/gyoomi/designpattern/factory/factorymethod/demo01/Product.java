/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.factorymethod.demo01;

/**
 * Product
 *
 * @author Leon
 * @date 2019-11-04 11:58
 */
public abstract class Product {

    /**
     * 产品类的公共方法
     *
     */
    public void method01() {
        System.out.println("Product common do something...");
    }

    /**
     * 公共的抽象方法
     *
     */
    public abstract void method02();

}
