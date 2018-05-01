/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package quickstart;

/**
 * @author liweifan
 * @version $Id: FooServiceImpl, v 0.1 2018/5/1 下午7:11 liweifan Exp $
 */
public class FooServiceImpl implements FooService {
    public String hello(String name) {
        System.out.println(name + "invoked rpc service");
        return "hello" + name;
    }
}