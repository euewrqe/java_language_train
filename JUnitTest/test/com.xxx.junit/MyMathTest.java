package com.xxx.junit;

/**
 * Created by nextgo on 2017/10/29 0029.
 */
import org.junit.Test;
import com.xxx.junit.MyMath;
import static org.junit.Assert.*;
public class MyMathTest {
    @Test
    public void testSum(){
        int actual = MyMath.sum(10, 20);
        int expected = 30;
        assertEquals(expected, actual);
    }
}
