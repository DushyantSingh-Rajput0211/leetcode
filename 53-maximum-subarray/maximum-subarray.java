class Solution {
    public int maxSubArray(int[] nums) {
       
        //Kadane's Algorithm

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int value : nums) {
            curSum += value;
            maxSum = Math.max(maxSum, curSum);

            if(curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }
}