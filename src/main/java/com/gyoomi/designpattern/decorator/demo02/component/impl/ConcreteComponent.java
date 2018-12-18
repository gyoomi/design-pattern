/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.decorator.demo02.component.impl;

import com.gyoomi.designpattern.decorator.demo02.component.Component;

/**
 * ConcreteComponent具体构件 <br />
 * <p>通用的基础实现</p>
 *
 * @author Leon
 * @version 2018/12/18 17:12
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("基础操作：do something.");
    }
}
