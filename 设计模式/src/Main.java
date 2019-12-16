import java.math.BigInteger;
import java.text.DecimalFormat;

/**
 * Created by nextgo on 2017/10/7 0007.
 */
import java.math.BigDecimal;
import java.util.Random;
import java.util.ArrayList;


public class Main {
    void buy(String prod){

    }

    static public void main(String[] args){
        DecimalFormat f1 = new DecimalFormat("###,###");

        System.out.println(f1.format(111123456));

        BigDecimal b1 = new BigDecimal(10);
        System.out.println(b1);
        BigDecimal b2 = new BigDecimal(20);
        System.out.println(b2);
        System.out.println(b1.add(b2));

        Random rd1 = new Random();
//        System.out.println(rd1.nextInt());
//        System.out.println(rd1.nextInt(5));
        for(int i = 0; i < 5; i++){
            System.out.println(rd1.nextInt(100));
        }
    }


    enum Result{
        SUCCESS,FAIL;
    }
    public static Result f1(int a, int b){
        try {
            int c = a / b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }

}
