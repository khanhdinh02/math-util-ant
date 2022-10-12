package com.name.mathutil.core;

public class MathUtil {

    public static final double PI = 3.141592653589793;

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}

/*
 * Test Driven Development
 * Là kĩ thuật/phong cách lập trinh mà kh viết code thì phải viết luôn các test cases để kiểm tra code của mình
 * Nếu ta xài TĐ, nó giúp ta đi vào quy trình CI - Continuous Intergration
 *
 * Để làm TDD, ta:
 * 1. Viết phát thảo prototype của method/class
 * 2. Viết các bộ test case là các đoạn code bổ sung thêm nhưng là code để xài các hàm vừa viết
 * 3. Chạy thử với bộ test case vừa tạo. Sai -> refactor, sửa code; đúng -> hoàn thiện code khác
 */
