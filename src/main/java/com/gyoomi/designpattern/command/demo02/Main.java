/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo02;

import com.gyoomi.designpattern.command.demo02.group.Group;
import com.gyoomi.designpattern.command.demo02.group.RequirementGroup;

/**
 * Client
 *
 * @author Leon
 * @date 2019-10-30 15:45
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("-------------客户要求新增一个需求-------------");
        // 客户先找到需求组，然后说来变更计划
        Group requirementGroup = new RequirementGroup();
        requirementGroup.find();
        requirementGroup.add();
        requirementGroup.plan();
    }
}
