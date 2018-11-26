/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.builder;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/11/24 23:27
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        director.getABenzCarModel().run();
        director.getCBWMModel().run();
        director.getDBWMModel().run();
    }
}
