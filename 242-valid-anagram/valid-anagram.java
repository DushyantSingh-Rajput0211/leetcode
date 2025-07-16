class Solution {
    public boolean isAnagram(String s, String t) {
        // If the string's length  are unequal.
        if(s.length() != t.length()) return false;

        // introduce a count array to store and manage the
        // frequency of characters in both the Strings
        int[] count = new int[26];

        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Check the count[] array
        for(int frequency: count) {
            if(frequency != 0)
                return false;
        }
        return true;
    }
}