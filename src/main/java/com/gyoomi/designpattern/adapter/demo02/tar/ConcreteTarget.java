/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.adapter.demo02.tar;

/**
 * 系统中已有的目标类接口
 *
 * @author Leon
 * @version 2018/12/12 16:28
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("If u need help, please call me!");
    }
}
