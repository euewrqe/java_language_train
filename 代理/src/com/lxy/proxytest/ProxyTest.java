package com.lxy.proxytest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * 代理某个函数
 * @author nest-go
 *
 */
public class ProxyTest {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//        ISome some = new SomeProxy();
//        some.doSomething(1234);
//        
        //创建一个委托对象
        ISome some = new Some();
        //创建调用处理器对象
        SomeInvocationHandler h = new SomeInvocationHandler(some);
        // 动态生成代理对象
        ISome s = (ISome)Proxy.newProxyInstance(some.getClass().getClassLoader(), new Class[] {ISome.class}, h);
        // 调用
        s.doSomething(22);
        
        
    }
    

    
}
