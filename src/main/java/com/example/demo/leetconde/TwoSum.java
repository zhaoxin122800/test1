package com.example.demo.leetconde;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * @param args 求数组中的两数之和，等于求得数 并返回
     */

    public static void main(String[] args) {
        int []  nums= new int[]{2, 11, 7};
        int target =9;
        int[] s= twoSum(nums,target);
        System.out.println(Arrays.toString(s));
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i< nums.length;i++){
            int coun=target-nums[i];
            if(map.containsKey(coun)){
                return new int[]{map.get(coun),i};
            }
            map.put(nums[i],i);

        }

        return new int[]{-1,-1};
    }
}
