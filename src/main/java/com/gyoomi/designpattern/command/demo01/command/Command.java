/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo01.command;

/**
 * Command
 *
 * @author Leon
 * @date 2019-10-30 11:53
 */
public abstract class Command {

    /**
     * 每个命令类都必须有一个执行方法
     */
    public abstract void execute();
}
