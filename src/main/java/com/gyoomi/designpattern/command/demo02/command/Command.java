/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.command.demo02.command;

import com.gyoomi.designpattern.command.demo02.group.CodeGroup;
import com.gyoomi.designpattern.command.demo02.group.PageGroup;
import com.gyoomi.designpattern.command.demo02.group.RequirementGroup;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-30 16:17
 */
public abstract class Command {

    /**
     * 把三个组都定义好， 子类可以直接使用
     */

    protected RequirementGroup rg = new RequirementGroup();

    protected PageGroup pg = new PageGroup();

    protected CodeGroup cg = new CodeGroup();

    /**
     * 只有一个方法， 你要我做什么事情
     */
    public abstract void execute();

}
