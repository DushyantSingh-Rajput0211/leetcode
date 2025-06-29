class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Base Case
        if(nums == null || nums.length < 3) return new ArrayList();
        //Storing the result
        Set<List<Integer>> result = new HashSet<>();
        //Sorting the array
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++) {         //i<arr.length-2 so that we can form atleast a triplet
            int j = i+1;
            int k = nums.length-1;

            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } 
                else if(sum < 0)
                    j++;
                else
                    k--;
            }
        }
        return new ArrayList(result);
    }
}