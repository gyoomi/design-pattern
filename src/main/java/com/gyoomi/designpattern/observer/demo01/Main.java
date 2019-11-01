/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.observer.demo01;

/**
 * 业务类或场景类
 *
 * @author Leon
 * @date 2019-11-01 15:24
 */
public class Main {

    public static void main(String[] args) {
        ConcreteSubject cs = new ConcreteSubject();
        ConcreteObserver01 co1 = new ConcreteObserver01();
        ConcreteObserver02 co2 = new ConcreteObserver02();

        cs.addObserver(co1);
        cs.addObserver(co2);
        cs.doSomething();
    }
}
