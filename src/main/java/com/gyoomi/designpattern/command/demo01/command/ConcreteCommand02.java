/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo01.command;

import com.gyoomi.designpattern.command.demo01.receiver.Receiver;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-30 14:15
 */
public class ConcreteCommand02 extends Command {

    private Receiver receiver;

    public ConcreteCommand02(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 具体命令类的执行方法
     */
    @Override
    public void execute() {
        receiver.doSomething();
    }
}
