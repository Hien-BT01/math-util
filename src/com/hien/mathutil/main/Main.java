/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hien.mathutil.main;

import com.hien.mathutil.core.MathUtil;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        // Kiểm thử bằng cách gọi hàm
        // nhìn vào kết quả của hàm trả về (Actual) so sánh với Expectation
        // ví dụ 5! ta hy vọng nhận được expected = 120
        // thực tế hàm getFactorial(5) trả về actual?
        // so sánh Expected vs Actual
        // để đảm bảo hàm chạy đúng, ta phải chia các trường hợp nghĩ ra
        // các tình huống hàm sẽ được sài, tức là nghĩ ra bộ data
        // đưa cho hàm, hàm chạy, output, kết luận
        // đích nào đó, ta gọi là test case - tình huống test
        // n = 5, gọi hàm getFactorial => test case
        // n = -5, gọi hàm getFactorial => test case
        
        // Test case #1: check getFactorial with valid argument
        long expected = 1;
        long actual = MathUtil.getFaactorial(0);
        System.out.println("0! -> expected: " + expected + " actual: " + actual);
        
        // Test case #2: check getFactorial with valid argument
        expected = 720;
        actual = MathUtil.getFaactorial(0);
        System.out.println("0! -> expected: " + expected + " actual: " + actual);
        
        // Test case #3: check getFactorial with Invalid argument
        actual = MathUtil.getFaactorial(-5);
    }
}
