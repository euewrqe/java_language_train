/**
 * Created by nextgo on 2017/10/24 0024.
 */
public class atm {
    static public void main(String[] args){
        Account act = new Account(50000.0);
        Thread t1 = new Thread(new Processor(act));
        Thread t2 = new Thread(new Processor(act));
        t1.start();
        t2.start();
        
    }
}

class Processor implements Runnable{
    private Account act;
    public Processor(Account act){
        this.act = act;
    }

    public void run(){
        this.act.withDraw(500);
        System.out.println(this.act.getBalance());
    }
}

class Account{
    private double balance;
    Account(){
        this.balance = 15000.0;
    }
    Account(double balance){
        this.balance = balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    //扣钱
    public synchronized void withDraw(double diff){
        double newBalance = this.balance - diff;
        try{Thread.sleep(1000);}catch (Exception e){}
        //更新
        this.setBalance(newBalance);
    }



}