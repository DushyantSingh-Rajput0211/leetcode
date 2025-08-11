class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Initialize left and right pointers
        int left = 0;
        int right = numbers.length-1;
        //Condition to avoid overlap
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum < target)
                left++;
            else if(sum > target) 
                right--;
            else
                return new int[]{left+1, right+1};
        }
        return new int[0];
    }
}