/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo02.command;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-30 16:36
 */
public class DeletePageCommand extends Command {

    @Override
    public void execute() {
        pg.find();
        pg.delete();
        pg.plan();
    }
}
