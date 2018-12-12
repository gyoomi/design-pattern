/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.adapter.demo03.adapter;

import com.gyoomi.designpattern.adapter.demo03.adaptee.AdapteeFun01;
import com.gyoomi.designpattern.adapter.demo03.adaptee.AdapteeFun02;
import com.gyoomi.designpattern.adapter.demo03.adaptee.AdapteeFun03;
import com.gyoomi.designpattern.adapter.demo03.tar.Target;

/**
 * 适配器
 *
 * @author Leon
 * @version 2018/12/12 17:34
 */
public class Adapter implements Target {

    private AdapteeFun01 adapteeFun01 = new AdapteeFun01();
    private AdapteeFun02 adapteeFun02 = new AdapteeFun02();
    private AdapteeFun03 adapteeFun03 = new AdapteeFun03();

    @Override
    public void fun01() {
        adapteeFun01.doIt();
    }

    @Override
    public void fun02() {
        adapteeFun02.doXX();
    }

    @Override
    public void fun03() {
        adapteeFun03.doYY();
    }
}
