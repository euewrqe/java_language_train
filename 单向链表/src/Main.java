/**
 * Created by nextgo on 2017/10/7 0007.
 */
public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        List li01 = new List(arr);
        li01.show();

        Integer n1 = 10;
        Integer n2 = n1;
        n2 += 1;
        System.out.println(n1 + "---" + n2);
        System.out.println(n2 == n1);


    }
}
