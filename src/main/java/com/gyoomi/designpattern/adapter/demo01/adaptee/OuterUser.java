/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.adapter.demo01.adaptee;

import java.util.HashMap;
import java.util.Map;

/**
 * 被适配者接口实现
 *
 * @author Leon
 * @version 2018/12/12 14:55
 */
public class OuterUser implements IOuterUser {

    @Override
    public Map getUserBaseInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("userName", "混世大魔王");
        map.put("mobilePhone", "123888888888");
        return map;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("jobPosition", "技术总监");
        map.put("officeTelNumber", "65659689");
        return map;
    }

    @Override
    public Map getUserHomeInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("homeTelNumber", "78945646");
        map.put("homeAddress", "幸福街幸福小区");
        return map;
    }
}
