class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            result.putIfAbsent(sortedString, new ArrayList());
            result.get(sortedString).add(s);
        }
        return new ArrayList(result.values());
    }
}