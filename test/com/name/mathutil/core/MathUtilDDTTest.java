package com.name.mathutil.core;

//import static com.name.mathutil.core.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/*
 * Class này sẽ chứa code dùng để test code chính bên class MathUtil.
 * Code viết ra dùng để test code khác (hàm khác/class khác)
 * thì đoạn code này, class này được gọi là test script.
 * Trong test script sẽ có những tình huống xài app, đưa data cụ thể vào
 * chờ xem hàn xử lí kết quả có như kì vọng hay không
 * Một test script sẽ chứa nhiều test case
 * 
 * Kĩ thuật viết test script mà tách biệt data ra khỏi lệnh so sách được gọi là:
 * - Parameterize: Tham số hoá, biến data ra 1 chỗ, đặt cho cái tên biến,
 * rồi nhồi chúng trở lại lệnh so sách
 * - Data Driven Testing:Viết code kiểm thử theo style tách data JUnit framework
 * hỗ trợ sẵn ta vụ tách data, duyệt vòng For trên data.
 */
@RunWith(Parameterized.class)
public class MathUtilDDTTest {

    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25};
        Integer b[][] = {
            {1, 0},
            {1, 1},
            {2, 2},
            {6, 3},
            {24, 4},
            {125, 5},
            {720, 6}
        };
        return b;
    }
    
    @Parameterized.Parameter(0)
    public long expected;
    @Parameterized.Parameter(1)
    public int n;
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}
