/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.factorymethod.demo01;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-11-04 14:20
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        ConcreteProduct01 product = factory.getProduct(ConcreteProduct01.class);
        product.method02();
    }
}
