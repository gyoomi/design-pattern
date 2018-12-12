/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.adapter.demo01.tar;

/**
 * 系统中已实现的接口
 *
 * @author Leon
 * @version 2018/12/12 14:51
 */
public class UserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        System.out.println("员工的名字");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("员工的家庭地址");
        return null;
    }

    @Override
    public String getMobilePhone() {
        System.out.println("员工的手机号码");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("员工的办公电话");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("员工的职位");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("员工的家庭电话");
        return null;
    }
}
