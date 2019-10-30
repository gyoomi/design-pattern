/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo01.receiver;

/**
 * Receiver
 *
 * @author Leon
 * @date 2019-10-30 11:48
 */
public abstract class Receiver {

    /**
     * 定义接受者，定义每个接受者必须完成的业务处理
     */
    public abstract void doSomething();

}
