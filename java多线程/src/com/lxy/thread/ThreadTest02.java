package com.lxy.thread;

public class ThreadTest02 {
    
}

class Thread01 extends Thread{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}