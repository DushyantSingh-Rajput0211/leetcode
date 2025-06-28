class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store number and its index
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement that would add up to the target
            int complement = target - nums[i];

            // Check if the complement already exists in the map
            if (map.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }

            // If not found, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found (shouldn't happen if problem guarantees a solution)
        return new int[] {};
    }
}