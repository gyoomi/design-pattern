/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.demo02;

import com.gyoomi.designpattern.factory.abstractfactory.demo02.factory.AbstractFactory;
import com.gyoomi.designpattern.factory.abstractfactory.demo02.factory.Factory01;
import com.gyoomi.designpattern.factory.abstractfactory.demo02.factory.Factory02;
import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.AbstractProductA;
import com.gyoomi.designpattern.factory.abstractfactory.demo02.product.AbstractProductB;

/**
 * 在场景类中， 没有任何一个方法与实现类有关系， 对于一个产品来说， 我们只要知道它
 * 的工厂方法就可以直接产生一个产品对象， 无须关心它的实现类。
 *
 * @author Leon
 * @date 2019-11-06 9:24
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory01 = new Factory01();
        AbstractFactory factory02 = new Factory02();

        // 产生A1
        AbstractProductA productA1 = factory01.createProductA();
        // 产生A2
        AbstractProductA productA2 = factory02.createProductA();
        // 产生B1
        AbstractProductB productB1 = factory01.createProductB();
        // 产生B2
        AbstractProductB productB2 = factory02.createProductB();

        // 拿着生成的具体的产品进行操作...
    }
}
