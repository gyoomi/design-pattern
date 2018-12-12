/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.adapter.demo03;

import com.gyoomi.designpattern.adapter.demo03.adapter.Adapter;
import com.gyoomi.designpattern.adapter.demo03.tar.MyTargetImpl;
import com.gyoomi.designpattern.adapter.demo03.tar.Target;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/12/12 17:29
 */
public class Main {

    public static void main(String[] args) {
        // 原有的业务逻辑代码
        Target sourceTarget = new MyTargetImpl();
        sourceTarget.fun01();
        sourceTarget.fun02();
        sourceTarget.fun03();
        System.out.println("--------------------------------");
        // 适配后的业务逻辑代码
        Target adapterTarget = new Adapter();
        adapterTarget.fun01();
        adapterTarget.fun02();
        adapterTarget.fun03();
    }
}
