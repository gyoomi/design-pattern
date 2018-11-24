/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.factorymethod.dao;


import com.gyoomi.designpattern.factory.factorymethod.bean.User;

/**
 * IUserDao Interface
 *
 * @author Leon
 * @version 2018/4/16 22:42
 */
public interface IUserDao {

    void addUser();

    void deleteUser(String id);

    User getUser(String id);
}
