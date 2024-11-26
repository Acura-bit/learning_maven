package test;

import cn.myphoenix.MathCalculate;
import org.junit.Test;

/**
 * 在 maven_03_javawebnew 模块中引入 maven_01_javase jar 包
 */
public class MathCalculateTest {

    @Test
    public void testSum() {

        MathCalculate mathCalculate = new MathCalculate();
        System.out.println(mathCalculate.sum(4, 5));
    }
}
