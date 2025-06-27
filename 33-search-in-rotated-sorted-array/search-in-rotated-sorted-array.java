class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;

        while(l <= r) { // Loop runs until the left index does not overlap the right index
            int mid = l + (r-l)/2;              
            if(nums[mid] == target) return mid;

            if(nums[l] <= nums[mid]) {      //Check if the left side of array is sorted
                if(nums[l] <= target && target <= nums[mid])    //Check if the target is in b/w left and mid element
                    r = mid - 1;
               else
                    l = mid + 1;
            }
            else {
                if(nums[mid] <= target && target <= nums[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }
    return -1;
    }
}