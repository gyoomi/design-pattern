/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.demo02.factory;

import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.AbstractProductA;
import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.AbstractProductB;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-11-06 8:49
 */
public abstract class AbstractFactory {

    /**
     * 创建A产品家族
     *
     * @return A产品
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建B产品家族
     *
     * @return B产品
     */
    public abstract AbstractProductB createProductB();

}
