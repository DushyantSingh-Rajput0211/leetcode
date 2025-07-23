class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Store result in a HashMap
        Map<String, List<String>> result = new HashMap<>();
        for(String s: strs) {
            int[] count = new int[26];
            /* Change each string value to character array and use ASCII values
            to check the frequency of each character for each string in strs */
            for(char c: s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            result.putIfAbsent(key, new ArrayList());
            result.get(key).add(s);
        }
        return new ArrayList(result.values());
    }
}
