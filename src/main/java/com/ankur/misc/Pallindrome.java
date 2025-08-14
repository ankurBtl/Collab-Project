package com.ankur.misc;

import java.util.Arrays;

public class Pallindrome {
    public static boolean isPallindromeGrv(String input){
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Gaurav");
        String str1 ="grv";
        String str2 ="rvg";
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println("this is pallindrome");
        }else{
            System.out.println("this is not pallindrome");
        }



    }

    public static boolean isPallindrome(String input){
        int left = 0, right = input.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(input.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(input.charAt(right))){
                right--;
            }
            if(input.charAt(left)!=input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
