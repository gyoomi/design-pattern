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
public class ConcreteCommand03 extends Command {

    /**
     * 对哪个Receiver类进行命令处理
     */
    private Receiver receiver;

    /**
     * 构造函数接受参数
     *
     * @param receiver receiver
     */
    public ConcreteCommand03(Receiver receiver) {
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
