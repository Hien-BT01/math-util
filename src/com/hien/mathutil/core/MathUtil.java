/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hien.mathutil.core;

/**
 *
 * @author HP
 */
// Class này cun cấp các tiện ích/ 1 lọa các hàm toán học
// giúp cho các class khác sử dụng..., ví dụ Caculator
// cần rất nhiều hàm toán học
// cái gì mà là tiện ích dùng chung, sure no nên dc design là static
public class MathUtil {
    // hàm tính n giai thừa n!
    // không có giai thừa số âm
    // 0! - 1! - 1 quy ước
    // giai thừa tăng rất nhanh, 20! vừa đủ cho long
    public static long getFaactorial(int n){
      if(n < 0 || n > 20) throw new IllegalArgumentException("Invalid argument. " 
              + "n must be between 0 ... 20");
      if(n == 0 || n == 1) return 1;
      long product = 1; // kết quả trung gian
        for (int i = 2; i <= n; i++) 
             product *= i;
        
        return product;
    }
}
