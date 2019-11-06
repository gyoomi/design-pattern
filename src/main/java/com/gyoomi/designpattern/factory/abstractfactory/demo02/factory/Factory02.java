/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.demo02.factory;

import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.AbstractProductA;
import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.AbstractProductB;
import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.ProductA2;
import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.ProductB2;

/**
 * 产品等级1的实现类
 *
 * @author Leon
 * @date 2019-11-06 8:58
 */
public class Factory02 extends AbstractFactory {

    /**
     * 只生产产品等级为2的A产品
     *
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    /**
     * 只生产产品等级为2的B产品
     *
     * @return
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
