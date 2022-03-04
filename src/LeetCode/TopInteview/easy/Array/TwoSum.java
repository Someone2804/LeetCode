package LeetCode.TopInteview.easy.Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.
     */

    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arr = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if(arr.containsKey(num)){
                return new int[]{arr.get(num), i};
            }else{
                arr.put(nums[i], i);
            }
        }
        return null;
    }
}