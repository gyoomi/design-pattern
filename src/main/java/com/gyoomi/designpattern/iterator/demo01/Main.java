/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.iterator.demo01;

import com.gyoomi.designpattern.iterator.demo01.aggregate.Aggregate;
import com.gyoomi.designpattern.iterator.demo01.aggregate.ConcreteAggregate;
import com.gyoomi.designpattern.iterator.demo01.iter.Iterator;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-11-06 15:48
 */
public class Main {

    public static void main(String[] args) {
        // 声明出容器
        Aggregate aggregate = new ConcreteAggregate();

        aggregate.add("aaa");
        aggregate.add("bbb");
        aggregate.add("ccc");
        aggregate.add("ddd");
        Iterator it = aggregate.iterator();
        // 遍历一下
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
