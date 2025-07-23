// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         //Store result in a HashMap
//         Map<String, List<String>> result = new HashMap<>();
//         for(String s: strs) {
//             int[] count = new int[26];
//             /* Change each string value to character array and use ASCII values
//             to check the frequency of each character for each string in strs */
//             for(char c: s.toCharArray()) {
//                 count[c - 'a']++;
//             }
//             String key = Arrays.toString(count);
//             result.putIfAbsent(key, new ArrayList());
//             result.get(key).add(s);
//         }
//         return new ArrayList(result.values());
//     }
// }

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];

            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            // Efficient key generation
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : freq) {
                keyBuilder.append('#'); // delimiter to separate counts
                keyBuilder.append(count);
            }
            String key = keyBuilder.toString(); // safe as a Map key

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}