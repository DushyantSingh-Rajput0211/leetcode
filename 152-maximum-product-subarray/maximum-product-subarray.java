class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pref = 1;
        int suff = 1;
        int maxProd = Integer.MIN_VALUE;    //Assigning minimum value to the max Product

        for(int i=0; i<n; i++) {
            //Edge case: For any 0 element(s) in the array
            if(pref == 0)
                pref = 1;
            if(suff == 0)
                suff = 1;
            //Logic
            pref *= nums[i];
            suff *= nums[n-i-1];
            
            maxProd = Math.max(maxProd, Math.max(pref, suff));
        }
        return maxProd;
    }
}