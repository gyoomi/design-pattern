/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.iterator.demo01.aggregate;

import com.gyoomi.designpattern.iterator.demo01.iter.ConcreteIterator;
import com.gyoomi.designpattern.iterator.demo01.iter.Iterator;

import java.util.Vector;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-11-06 15:44
 */
public class ConcreteAggregate implements Aggregate {

    /**
     * 容纳对象的容器
     */
    private Vector vector = new Vector();

    /**
     * 增加一个元素
     * @param object
     */
    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    /**
     * 返回迭代器对象
     * @param object
     */
    @Override
    public void remove(Object object) {
        this.vector.remove(object);
    }

    /**
     * 删除一个元素
     * @return
     */
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
