/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo01;

import com.gyoomi.designpattern.command.demo01.command.ConcreteCommand01;
import com.gyoomi.designpattern.command.demo01.receiver.ConcreteReceiver01;

/**
 * 场景类或调用类
 *
 * @author Leon
 * @date 2019-10-30 14:38
 */
public class Main {


    public static void main(String[] args) {
        // 首先声明调用者Invoker
        Invoker invoker = new Invoker();
        // 定义接受者
        ConcreteReceiver01 concreteReceiver01 = new ConcreteReceiver01();
        // 定义一个发送给接受者的命令
        ConcreteCommand01 command01 = new ConcreteCommand01(concreteReceiver01);
        // 把命令交给调用者去执行
        invoker.setCommand(command01);
        invoker.action();
    }
}
