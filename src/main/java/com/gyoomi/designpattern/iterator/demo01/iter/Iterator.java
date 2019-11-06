/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.iterator.demo01.iter;

/**
 * The description of interface
 *
 * @author Leon
 * @date 2019-11-06 14:54
 */
public interface Iterator {

    /**
     * 遍历到下一个元素
     *
     * @return 下一个元素
     */
    Object next();

    /**
     * 是否已经遍历到尾部
     *
     * @return
     */
    boolean hasNext();

    /**
     * 删除当前指向的元素
     *
     * @return
     */
    boolean remove();
}
