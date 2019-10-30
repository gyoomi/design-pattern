/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo01.receiver;

/**
 * ConcreteReceiver01
 *
 * @author Leon
 * @date 2019-10-30 11:50
 */
public class ConcreteReceiver01 extends Receiver {

    /**
     * 具体接受者1需要完成的业务处理逻辑
     */
    @Override
    public void doSomething() {
        System.out.println("业务处理1...");
    }
}
