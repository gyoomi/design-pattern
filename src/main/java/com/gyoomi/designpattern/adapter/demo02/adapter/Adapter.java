/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.adapter.demo02.adapter;

import com.gyoomi.designpattern.adapter.demo02.adaptee.Adaptee;
import com.gyoomi.designpattern.adapter.demo02.tar.Target;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/12/12 16:50
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.doSomething();
    }
}
