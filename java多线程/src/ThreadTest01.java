/**
 * Created by nextgo on 2017/10/23 0023.
 */
import java.lang.*;
import java.net.ServerSocket;

public class ThreadTest01 {
    static public void main(String[] args) throws Exception{
        Thread t01 = new Thread(new Processor02("t01"),"target01");
        Thread t02 = new Thread(new Processor02("t02"),"target02");
        System.out.println(t01.getName());
        System.out.println(t02.getName());
        t01.start();   //告诉java虚拟机再启动一个栈给 t01
        t02.start();
        t02.join();
        System.out.println("hello");
    }
}
class Processor01 extends Thread{
    private String name;
    public Processor01(String name){
        this.name = name;
    }

    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(this.name+"--->"+i);

        }
    }
}

class Processor02 implements Runnable{
    private String name;
    public Processor02(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(this.name+"--->"+i);

        }
    }
}