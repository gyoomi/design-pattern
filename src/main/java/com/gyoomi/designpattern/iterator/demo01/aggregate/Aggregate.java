/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.iterator.demo01.aggregate;

import com.gyoomi.designpattern.iterator.demo01.iter.Iterator;

/**
 * The description of interface
 *
 * @author Leon
 * @date 2019-11-06 15:37
 */
public interface Aggregate {

    /**
     * 是容器必然有元素的增加
     * @param object
     */
    void add(Object object);

    /**
     * 减少元素
     * @param object
     */
    void remove(Object object);

    /**
     * 由迭代器来遍历所有的元素
     * @return
     */
    Iterator iterator();
}
