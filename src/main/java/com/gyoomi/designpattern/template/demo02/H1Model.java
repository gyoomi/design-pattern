/**
 * Copyright © 2019, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.template.demo02;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/2 16:27
 */
public class H1Model extends HummerModel {

    @Override
    protected void start() {
        System.out.println("H1 start...");
    }

    @Override
    protected void alarm() {
        System.out.println("H1 alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H1 engineBoom");
    }

    @Override
    protected void stop() {
        System.out.println("H1 stop");
    }

}
