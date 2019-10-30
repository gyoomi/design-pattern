/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo02;

import com.gyoomi.designpattern.command.demo02.command.Command;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-30 16:37
 */
public class Invoker {

    /**
     * 什么命令
     */
    private Command command;

    /**
     * 客户发出命令
     * @param command 什麽命令
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行客户的命令
     */
    public void action() {
        this.command.execute();
    }
}
