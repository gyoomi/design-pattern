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
 * @date 2019-11-04 14:12
 */
public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T getProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
