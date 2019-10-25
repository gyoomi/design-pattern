/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.prototype.demo01;

/**
 * 模板类
 *
 * @author Leon
 * @date 2019-10-25 15:11
 */
public class AdvTemplate {

    /**
     * 标题
     */
    private String advSubject = "中国银行国庆节抽奖活动";

    /**
     * 活动内容
     */
    private String advContext = "国庆节消费满8888元：就抽奖送你Iphone11等精彩大奖！！！";

    public String getAdvSubject() {
        return advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }
}
