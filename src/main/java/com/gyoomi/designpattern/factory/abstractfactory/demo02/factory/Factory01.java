/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.demo02.factory;

import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.AbstractProductA;
import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.AbstractProductB;
import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.ProductA1;
import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.ProductB1;

/**
 * 产品等级1的实现类
 *
 * @author Leon
 * @date 2019-11-06 8:58
 */
public class Factory01 extends AbstractFactory {

    /**
     * 只生产产品等级为1的A产品
     *
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    /**
     * 只生产产品等级为1的B产品
     *
     * @return
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
