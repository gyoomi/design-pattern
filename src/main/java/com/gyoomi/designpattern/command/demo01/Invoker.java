/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo01;

import com.gyoomi.designpattern.command.demo01.command.Command;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-30 14:28
 */
public class Invoker {

    private Command command;

    /**
     * 执行命令
     */
    public void action() {
        this.command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
