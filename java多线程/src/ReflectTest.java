/**
 * Created by nextgo on 2017/10/24 0024.
 */
import java.util.Date;
import java.lang.Class;
public class ReflectTest {
    public static void main(String[]  args)  throws Exception{
        Class c1 = Class.forName("java.util.Date");
        Class c2 = Class.forName("Account");
        System.out.println(c1);
        System.out.println(c2);
        Class c3 = Account.class;
        System.out.println(c3);
        int a = 10;
        System.out.println(int.class);

        Object o = c2.newInstance();
        System.out.println(o);

        ReflectTest.m1(11,22,33,44);

    }
    public static void m1(int n, int ...args){
        System.out.println(args);
        System.out.println(args.length);
        System.out.println(args[0]);
    }

}
