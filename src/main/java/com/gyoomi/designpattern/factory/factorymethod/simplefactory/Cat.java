/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.factorymethod.simplefactory;

/**
 * 具体产品2
 *
 * @author Leon
 * @version 2018/4/16 15:14
 */
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("cat like eating fishes...");
    }

    @Override
    public void sleep() {
        System.out.println("cat catch mouse in the night...");
    }
}
