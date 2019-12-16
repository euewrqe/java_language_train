package com.lxy.proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SomeInvocationHandler implements InvocationHandler {
    private ISome some;
    
    public SomeInvocationHandler(ISome s) {
        // TODO Auto-generated constructor stub
        some = s;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("proxy");
        System.out.println(method.toString());
        method.invoke(some, args);
        return null;
    }

}
