package test;

import cn.myphoenix.MathCalculate;
import org.junit.Test;

public class MathCalculateTest {

    @Test
    public void testSum() {

        MathCalculate mathCalculate = new MathCalculate();
        System.out.println(mathCalculate.sum(4, 5));

    }

    @Test
    public void testMul() {

        MathCalculate mathCalculate = new MathCalculate();
        System.out.println(mathCalculate.mul(4, 5));
    }
}
