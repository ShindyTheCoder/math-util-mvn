package org.shindy.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.shindy.mathutil.core.MathUtility;

public class MathUtilityTest {

    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        //assertEquals(69, 69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(720, MathUtility.getFactorial(6));
    }
    //KIẾN THỨC MỚI: DDT
    //                DDT; Data Driven Testing
    //                Kĩ thuật viết code kiểm thử của UnitTest mà tách phần data ra khỏi câu lệch assertE()
    //Viết các testcase hướng về việc tách data test ra riêng biệt
    // Không nhầm lần với TDD: Test Driven Development
    // Kĩ thuật viết code làm app thì phải viết luôn code cho các test case để đẩm bảo hàm/method/class chạy ngon
    
    //TDD: viết code chính và code test/testcasse đan xen để check hàm đúng sai
    
    //DDT: trong quá trình viết code test, tách data test ra riêng 1 chỗ cho dễ đọc, bảo trì 
     
    // DDT là nằm trong TDD
    // 
    // 
    // 
    // 
    // 
    // 
    // 
    // 
    // 
    // 
    // 
    // 
    // 
    // 
    // 
    
    
}
