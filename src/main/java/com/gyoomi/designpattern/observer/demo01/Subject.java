/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.observer.demo01;

import java.util.Vector;

/**
 * 抽象被观察者
 *
 * @author Leon
 * @date 2019-11-01 15:05
 */
public abstract class Subject {

    /**
     * 观察者列表
     */
    private Vector<Observer> observers = new Vector<>();

    /**
     * 添加观察者
     *
     * @param observer 观察者
     */
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }


    /**
     * 删除观察者
     *
     * @param observer 观察者
     */
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * 通知所有观察者
     *
     */
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }

}
