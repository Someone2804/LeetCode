package LeetCode.TopInteview.easy.DynamicProgramming;

public class ClimbingStairs {
    /*
    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     */
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        int[] prev = new int[]{1,2};
        for(int i = 2; i < n; i++){
            int temp = prev[1];
            prev[1] = prev[0] + prev[1];
            prev[0] = temp;
        }
        return prev[1];
    }
}
