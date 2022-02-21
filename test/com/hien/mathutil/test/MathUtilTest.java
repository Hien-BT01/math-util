/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hien.mathutil.test;

import static com.hien.mathutil.core.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilTest {
    // Test case #1: getF() with valid argument
    // n = 0, expected = 1, actual: đoán xem
    // @Test biến 1 hàm bất khi trong class thành hàm main
    @Test
    public void testFactorialGivenValidArgumentReturnsWell() {
        long expected = 1; // hy vọng hàm trả về 1 nếu tính 0!
        long actual = getFaactorial(0);
        assertEquals(expected, actual);
        // trong main() kiểu cũ, ta in ra kết quả expected và actual
        // bên JUnit, tung ra 2 màu sắc: Xanh (2 thằng khớp nhau)
        //                               Đỏ (2 thằng không khớp)
    }
    // Ngoại lệ thì làm sao để test
    // Ngoại lệ không phải là 1 value
    // Ngoại lệ là 1 tình huống, thứ gì đó bất thường, có khả năng xuất/xảy ra
    // Ngoại lệ không dùng hàm assertEqual
    // chỉ đo lường bằng cách co xuát hiện hay không?
    // Test case #2: getF() with valid argument
    // n = 6, expected = 720, actual: đoán xem
    @Test
    public void testFactorialGivenValidArgumentN6ReturnsWell() {
        long expected = 720; // hy vọng hàm trả về 1 nếu tính 0!
        long actual = getFaactorial(6);
        assertEquals(expected, actual);
        // trong main() kiểu cũ, ta in ra kết quả expected và actual
        // bên JUnit, tung ra 2 màu sắc: Xanh (2 thằng khớp nhau)
        //                               Đỏ (2 thằng không khớp)
    }
    @Test(expected = IllegalArgumentException.class)
    
    public void testFactorialGivenInValidArgumentThrowException() {
         // hy vọng hàm trả về 1 nếu tính 0!
        getFaactorial(-5);
        
    }
}
