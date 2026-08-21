class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();
        
        // Build frequency map for s1
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int left = 0;
        int right = 0;
        int matchesNeeded = map.size(); // Number of unique characters we need to match
        
        while (right < s2.length()) {
            char rightChar = s2.charAt(right);
            
            // If character exists in s1, decrement its count
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                // If count becomes 0, we have matched all occurrences of this character
                if (map.get(rightChar) == 0) {
                    matchesNeeded--;
                }
            }
            
            // When window is too large, shrink from left
            if (right - left + 1 > s1.length()) {
                char leftChar = s2.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    // If count goes from 0 to 1, we lost a match
                    if (map.get(leftChar) == 1) {
                        matchesNeeded++;
                    }
                }
                left++;
            }
            
            // Check if we found a permutation
            if (right - left + 1 == s1.length() && matchesNeeded == 0) {
                return true;
            }
            
            right++;
        }
        
        return false;
    }
}