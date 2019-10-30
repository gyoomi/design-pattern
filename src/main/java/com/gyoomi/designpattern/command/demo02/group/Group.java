/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo02.group;

/**
 * 抽象组
 *
 * @author Leon
 * @date 2019-10-30 15:33
 */
public abstract class Group {

    /**
     * 甲乙双方分开办公， 如果你要和某个组讨论， 你首先要找到这个
     */
    public abstract void find();

    /**
     * 被要求增加功能
     */
    public abstract void add();

    /**
     * 被要求删除功能
     */
    public abstract void delete();

    /**
     * 被要求修改功能
     */
    public abstract void change();

    /**
     * 被要求给出所有的变更计划
     */
    public abstract void plan();
}
