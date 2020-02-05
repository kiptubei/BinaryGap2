/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryGap2;

/**
 *
 * @author mark
 */
public class Solution {

    public int solution(int N) {
        int result = 0;
        int count = 0;

        String binaryString;
        binaryString = Integer.toBinaryString(N);
       
       
        for (int i = 1; i < binaryString.length() - 1; i++) {
            if (binaryString.charAt(i) == '0') {
                count++;
                 if (count > result) {
                    result = count;
                 }
            }else{
                count = 0;
            }

           

        }

        return result;

    }
}
