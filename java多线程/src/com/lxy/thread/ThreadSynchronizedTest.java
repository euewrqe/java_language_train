package com.lxy.thread;

public class ThreadSynchronizedTest {

    public static void main(String[] args) {
        TicketSeller2 seller = new TicketSeller2();
        
        Thread t01 = new Thread(seller, "窗口1");
        Thread t02 = new Thread(seller, "窗口2");
        Thread t03 = new Thread(seller, "窗口3");

        t01.start();
        t02.start();
        t03.start();
    }
}

/**
 * 非线程安全，数据共享时无法保证修改的数据正确
 * @author nest-go
 *
 */
class TicketSeller implements Runnable {
    
    public int ticketCount = 100;
    Object obj = new Object();
    
    /**
     * 
     */
    @Override
    public void run() {
        // TODO Auto-generated method stub

        for (; ticketCount > 0; ticketCount--) {
            System.out.println("线程" + Thread.currentThread().getName() + ":卖出了"
                    + (100 - ticketCount) + "张票，还剩下" + ticketCount + "张票");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        
    }

}


/**
 * 用synchorized修饰代码块或者函数，来实现数据安全
 * @author nest-go
 *
 */
class TicketSeller2 implements Runnable {
    
    public int ticketCount = 100;
    Object obj = new Object();
    
    /**
     * 
     */
    @Override
    public void run() {
        // TODO Auto-generated method stub
        hole3();
        
        
    }
    
    // 代码块
    public void hole1() {
        synchronized (obj) {
            for (; ticketCount > 0; ticketCount--) {
                System.out.println("线程" + Thread.currentThread().getName() + ":卖出了"
                        + (100 - ticketCount) + "张票，还剩下" + ticketCount + "张票");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
        }
    }
    
    // 函数范围的线程安全
    public synchronized void hole2() {
        for (; ticketCount >= 0; ticketCount--) {
            System.out.println("线程" + Thread.currentThread().getName() + ":卖出了"
                    + (100 - ticketCount) + "张票，还剩下" + ticketCount + "张票");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
    
    
    /**
            *   如果同一个函数同时执行不同代码块，对象要一致， 一个代码块和一个函数同时执行时，共同的对象是this
               如果一个静态函数，一个是代码块同时执行时，共同的对象是类本身
     */
    public void hole3() {
        for (; ticketCount >= 0; ticketCount--) {
            if(ticketCount > 20) {
                synchronized (this) {
                    System.out.println("线程" + Thread.currentThread().getName() + ":卖出了"
                            + (100 - ticketCount) + "张票，还剩下" + ticketCount + "张票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    
                }
            }else {
                synchronized (obj) {
                    System.out.println("线程" + Thread.currentThread().getName() + ":卖出了"
                            + (100 - ticketCount) + "张票，还剩下" + ticketCount + "张票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    
                }
            }
            
        }
    }
}
