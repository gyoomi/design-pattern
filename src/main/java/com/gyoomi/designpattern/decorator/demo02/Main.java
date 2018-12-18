/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.decorator.demo02;

import com.gyoomi.designpattern.decorator.demo02.component.Component;
import com.gyoomi.designpattern.decorator.demo02.component.impl.ConcreteComponent;
import com.gyoomi.designpattern.decorator.demo02.decorctor.impl.ConcreteDecorator1;
import com.gyoomi.designpattern.decorator.demo02.decorctor.impl.ConcreteDecorator2;

/**
 * 调用客户端
 *
 * @author Leon
 * @version 2018/12/18 17:27
 */
public class Main {


    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecorator1 cd1 = new ConcreteDecorator1(component);
        ConcreteDecorator2 cd2 = new ConcreteDecorator2(cd1);
        cd2.operate();

        // 执行结果如下：
        /**
         *
         * 附加功能1：run
         * 基础操作：do something.
         * 附加功能2：run
         *
         */
    }
}
