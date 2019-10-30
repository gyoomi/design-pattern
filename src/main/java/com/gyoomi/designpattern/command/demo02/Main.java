/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo02;

import com.gyoomi.designpattern.command.demo02.command.AddRequirementCommand;

/**
 * Client
 *
 * @author Leon
 * @date 2019-10-30 15:45
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("-------------客户要求新增一个需求-------------");
        // 小明算是接头人
        Invoker xiaoming = new Invoker();
        AddRequirementCommand addRequirementCommand = new AddRequirementCommand();
        xiaoming.setCommand(addRequirementCommand);
        xiaoming.action();
    }
}
