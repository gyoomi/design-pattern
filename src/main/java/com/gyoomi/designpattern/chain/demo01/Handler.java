package com.gyoomi.designpattern.chain.demo01;

import com.gyoomi.designpattern.chain.demo01.support.Level;
import com.gyoomi.designpattern.chain.demo01.support.Request;
import com.gyoomi.designpattern.chain.demo01.support.Response;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/2 22:06
 */
public abstract class Handler {

    private Handler nextHandler;

    /**
     * 每个处理者都有一个处理级别
     *
     * @return
     */
    protected abstract Level getHandlerLevel();

    /**
     * 每个处理者都必须实现处理任务
     *
     * @param request
     * @return
     */
    protected abstract Response echo(Request request);

    /**
     * 设置下一个处理者是谁
     *
     * @param nextHandler
     */
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 每个处理者都必须对请求做出处理
     *
     * @param request
     * @return
     */
    public final Response handleMessage(Request request) {
        Response response = null;
        // 判断是否是自己的处理级别
        if (this.getHandlerLevel().equals(request.getLevel())) {
            response = this.echo(request);
        } else {
            // 判断是否有下一个处理者
            if (null != this.nextHandler) {
                response = this.nextHandler.handleMessage(request);
            } else {
                // 没有适当的处理人，业务自行进行处理
            }
        }
        return response;
    }

}
