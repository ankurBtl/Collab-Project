package com.ankur.misc;

import java.util.ArrayList;

public class Pairsum {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(-5);
        input.add(-2);
        input.add(3);
        input.add(4);
        input.add(6);
        ArrayList<Integer> res = pairSum(input,7);
        System.out.println(res);
    }
    public static ArrayList<Integer> pairSum(ArrayList<Integer> nums, int target){
        int left=0, right = nums.size()-1;
        while (left<right) {
            int sum = nums.get(left)+nums.get(right);
            if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }else{
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left);
                pair.add(right);
                return pair;
            }
        }
        return new ArrayList<>();
    }
}
