/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.iterator.demo01.iter;

import java.util.Vector;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-11-06 15:09
 */
public class ConcreteIterator implements Iterator {

    private Vector vector = new Vector();


    /**
     * 定义当前游标
     */
    public int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    /**
     * 返回下一个元素
     *
     * @return
     */
    @Override
    public Object next() {
        return this.hasNext() ? this.vector.get(cursor++) : null;
    }

    /**
     * 判断是否到达尾部
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return this.cursor < this.vector.size();
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor++);
        return true;
    }
}
