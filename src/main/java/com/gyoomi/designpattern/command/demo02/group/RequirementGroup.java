/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo02.group;

/**
 * 需求组
 *
 * @author Leon
 * @date 2019-10-30 15:38
 */
public class RequirementGroup extends Group {

    @Override
    public void find() {
        System.out.println("找到需求组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一个需求...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个需求...");
    }

    @Override
    public void change() {
        System.out.println("客户要求改变一个需求...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求需求变更计划...");
    }
}
