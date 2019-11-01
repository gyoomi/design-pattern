/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.observer.demo01;

/**
 * 具体的观察者01
 *
 * @author Leon
 * @date 2019-11-01 15:22
 */
public class ConcreteObserver01 implements Observer {


    @Override
    public void update() {
        System.out.println("间谍-01：观察到被观察者有变化，通知上级...");
    }
}
