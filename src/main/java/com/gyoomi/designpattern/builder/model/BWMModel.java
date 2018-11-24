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
 * @version 2018/11/24 23:22
 */
public class BWMModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马启动了...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马鸣笛了...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎启动了...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停止了...");
    }
}
