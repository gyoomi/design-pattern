/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.prototype.demo01;

import java.util.Random;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-25 15:22
 */
public class Client {

    private static int sendCount = 6;

    public static void main(String[] args) {
        // 模拟发送邮件
        Email email = new Email(new AdvTemplate());
        email.setTail("中国银行版权所有！！！");
        int i = 0;
        while (i < sendCount) {
            // 重点在这里||||||||||||
            Email cloneEmail = email.clone();
            cloneEmail.setAppellation(getRandomString() + " 先生或女士");
            cloneEmail.setReceiver(getRandomString() + "@qq.com");
            sendEmail(cloneEmail);
            i++;
        }
    }

    public static void sendEmail(Email email) {
        System.out.println("标题：" + email.getSubject() + "   收件人：" + email.getReceiver() + "发送成功...");
    }

    public static String getRandomString() {
        return Math.abs(new Random().nextInt()) + "";
    }
}
