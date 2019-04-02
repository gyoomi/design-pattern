package com.gyoomi.designpattern.chain.demo01;

import com.gyoomi.designpattern.chain.demo01.support.Level;
import com.gyoomi.designpattern.chain.demo01.support.Request;
import com.gyoomi.designpattern.chain.demo01.support.Response;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/2 22:17
 */
public class ConcreteHandler01 extends Handler {

    /**
     * 设置自己的处理级别
     *
     * @return
     */
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    /**
     * 定义自己的处理逻辑
     *
     * @param request
     * @return
     */
    @Override
    protected Response echo(Request request) {
        return null;
    }
}
