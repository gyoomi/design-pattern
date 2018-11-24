/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.builder.model;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/11/24 18:58
 */
public class BenzCarModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("奔驰车启动了...");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车鸣笛了...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎启动了...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止了...");
    }
}
