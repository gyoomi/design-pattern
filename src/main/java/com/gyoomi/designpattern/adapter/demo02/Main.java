/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.adapter.demo02;

import com.gyoomi.designpattern.adapter.demo02.adapter.Adapter;
import com.gyoomi.designpattern.adapter.demo02.tar.ConcreteTarget;
import com.gyoomi.designpattern.adapter.demo02.tar.Target;

/**
 * 场景类
 *
 * @author Leon
 * @version 2018/12/12 16:25
 */
public class Main {

    public static void main(String[] args) {
        // 原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        System.out.println("-----------------");
        // 现增加适配器角色后的业务逻辑
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
