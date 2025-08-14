package com.ankur.misc;

import java.util.Arrays;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isPallindrome("12/02/2021"));
        System.out.println(isPallindromeGrv("12/02/2021"));
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

    public static boolean isPallindromeGrv(String input){
       String rev="";
        for(int i=0;i<input.length();i++){
            rev=input.charAt(i)+rev;
        }
        return input.equals(rev);
    }
}
