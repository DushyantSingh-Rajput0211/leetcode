class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each number using a HashMap
        Map<Integer, Integer> count = new HashMap<>();
        
        // freq[i] will contain a list of numbers that appear exactly i times
        // The size is nums.length + 1 because the maximum frequency of any number can be nums.length
        List<Integer>[] freq = new List[nums.length + 1];

        // Initialize each list in the freq array
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        // Step 2: Populate the count map with frequency of each number
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Step 3: Place each number into the bucket corresponding to its frequency
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            freq[frequency].add(number);
        }

        // Step 4: Collect the top k frequent elements from the freq array
        int[] res = new int[k];
        int index = 0;

        // Start from the end (highest frequency) and work backwards
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                // Return early once we have collected k elements
                if (index == k)
                    return res;
            }
        }

        // Return result in case the return inside loop didn't trigger (edge cases)
        return res;
    }
}