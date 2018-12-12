/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.adapter.demo01;

import com.gyoomi.designpattern.adapter.demo01.adapter.OutUserInfo;
import com.gyoomi.designpattern.adapter.demo01.tar.IUserInfo;
import com.gyoomi.designpattern.adapter.demo01.tar.UserInfo;

/**
 * 场景类角色
 *
 * @author Leon
 * @version 2018/12/12 14:48
 */
public class Main {

    public static void main(String[] args) {
        // 没有和外界联系时
        IUserInfo youngGirls = new UserInfo();
        for (int i = 0; i < 100; i++) {
            System.out.println(youngGirls.getMobilePhone());
        }
        System.out.println("-----------------------------");
        // 调用外部的人员信息
        IUserInfo outYoungGirls = new OutUserInfo();
        for (int i = 0; i < 100; i++) {
            System.out.println(outYoungGirls.getMobilePhone());
        }
    }
}







