/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.prototype.demo01;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-25 15:15
 */
public class Email implements Cloneable {

    /**
     * 收件人
     */
    private String receiver;

    /**
     * 邮件名称
     */
    private String subject;

    /**
     * 称谓
     */
    private String appellation;

    /**
     * 邮件内容
     */
    private String context;

    /**
     * 尾部信息：一般包含xxx公司版权所有...
     */
    private String tail;

    public Email(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    protected Email clone() {
        Email email = null;
        try {
            email = (Email) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return email;
    }
}
