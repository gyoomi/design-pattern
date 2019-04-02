/**
 * Copyright © 2019, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.template.demo01;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/2 16:01
 */
public class Main {

    public static void main(String[] args) throws Exception {
        AbstractClass concrete1 = new ConcreteClass01();
        AbstractClass concrete2 = new ConcreteClass02();
        concrete1.templateMethod();
        System.out.println("************");
        concrete2.templateMethod();
    }
}
