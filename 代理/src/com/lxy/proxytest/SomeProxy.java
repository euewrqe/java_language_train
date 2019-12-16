package com.lxy.proxytest;

/**
 * 静态代理
 * @author nest-go
 *
 */
public class SomeProxy implements ISome {
    
    ISome some;
    public SomeProxy() {
        some = new Some();
    }
    
    public void doSomething(int val) {
        System.out.println("proxy");
        some.doSomething(val);
    }
}
