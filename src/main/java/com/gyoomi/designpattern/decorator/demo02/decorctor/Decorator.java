/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.decorator.demo02.decorctor;

import com.gyoomi.designpattern.decorator.demo02.component.Component;

/**
 * 抽象装饰者
 *
 * @author Leon
 * @version 2018/12/18 17:18
 */
public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component ) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
