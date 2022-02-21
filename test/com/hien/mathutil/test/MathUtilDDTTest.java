/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hien.mathutil.test;

import static com.hien.mathutil.core.MathUtil.getFaactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author HP
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    // cần test thử hàm getFactorial bên code chính chạy đúng không
    // rõ ràng ta phải đưa data cho hàm, xong xem giá trị trả về
    // so sánh kết luận hàm đúng sai
    // 3 việc: chuẩn bị data, đưa data vào hàm(gọi hàm) kết luận đúng sai
    // học cách viết code tách hàm data ra khỏi câu lệnh
    // lưu table SQLServer, Excel, .CSV
    // Lưu trong một mảng cũng oke
    // hàm trả về mảng 2 chiều kiểu object
    // vì các framework work with object... phải hiểu là object
    // phải hiểu là object, tức chơi work với Wrapper class
    
    //báo mày JVM JUnit đây là data nguồn!! dùng nhồi vào Assert
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {6, 720}
        };
    }
    
    // cần trich mạng con ra để được cặp value input / expected
    @Parameterized.Parameter(value = 0)// map cột 0
    public int input;
    
    @Parameterized.Parameter(value = 1)// map cột 1
    public int expected;
    
    @Test
    public void testFactorialGivenValidArgumentReturnsWell() {
        assertEquals(expected, getFaactorial(input));
        // trong main() kiểu cũ, ta in ra kết quả expected và actual
        // bên JUnit, tung ra 2 màu sắc: Xanh (2 thằng khớp nhau)
        //                               Đỏ (2 thằng không khớp)
    }
}
// DDT tách data cần test ra 1 chỗ, lấy từng miếng data
// nhồi/ lắp vào trong chỗ gọi hàm, chỗ assert()
// tách và nhồi vào -> làm hoài cho các bộ data
// phải thông qua tên/ tham số
// DDT còn đc gọi là: tham số hóa Data