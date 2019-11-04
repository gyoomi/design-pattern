/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.factorymethod.demo03;

import java.lang.reflect.Constructor;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-11-04 15:10
 */
public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            Class clazz = Class.forName(Singleton.class.getName());
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = ((Singleton) constructor.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
