/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.observer.demo01;

/**
 * 具体被观察者
 *
 * @author Leon
 * @date 2019-11-01 15:20
 */
public class ConcreteSubject extends Subject {

    public void doSomething() {
        System.out.println("具体被观察者: 我进行了一些计算活动...");
        super.notifyObserver();
    }
}
