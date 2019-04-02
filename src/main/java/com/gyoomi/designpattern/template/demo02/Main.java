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
public class Main {

    public static void main(String[] args) throws Exception {
        HummerModel h1 = new H1Model();
        h1.setAlarm(false);
        h1.run();
        System.out.println("******************************");
        HummerModel h2 = new H1Model();
        h2.setAlarm(true);
        h2.run();
    }
}
