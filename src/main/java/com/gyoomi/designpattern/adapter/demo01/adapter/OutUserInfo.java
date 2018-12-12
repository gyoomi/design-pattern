/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.adapter.demo01.adapter;

import com.gyoomi.designpattern.adapter.demo01.adaptee.OuterUser;
import com.gyoomi.designpattern.adapter.demo01.tar.IUserInfo;

import java.util.Map;

/**
 * 适配器角色
 *
 * @author Leon
 * @version 2018/12/12 15:03
 */
public class OutUserInfo extends OuterUser implements IUserInfo {

    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        return ((String) baseInfo.get("userName"));
    }

    @Override
    public String getHomeAddress() {
        return ((String) homeInfo.get("homeAddress"));
    }

    @Override
    public String getMobilePhone() {
        return ((String) baseInfo.get("mobilePhone"));
    }

    @Override
    public String getOfficeTelNumber() {
        return ((String) officeInfo.get("officeTelNumber"));
    }

    @Override
    public String getJobPosition() {
        return ((String) officeInfo.get("jobPosition"));
    }

    @Override
    public String getHomeTelNumber() {
        return ((String) homeInfo.get("homeTelNumber"));
    }
}
