/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.adapter.demo03.tar;

/**
 * 目标接口的现有实现类
 *
 * @author Leon
 * @version 2018/12/12 17:31
 */
public class MyTargetImpl implements Target {

    @Override
    public void fun01() {
        System.out.println("my fun01");
    }

    @Override
    public void fun02() {
        System.out.println("my fun02");
    }

    @Override
    public void fun03() {
        System.out.println("my fun03");
    }
}
