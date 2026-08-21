class Solution {
    public int characterReplacement(String s, int k) {
        
        Map<Character, Integer> map = new HashMap<>();
        // int[] count = new int[26]; // A-Z
        int maxLength=0; 
        int maxFreq=0;
        int start = 0;

        for(int end=0; end<s.length(); end++){
            // Add current character to frequency map
            char currentChar = s.charAt(end);
            map.put(currentChar, map.getOrDefault(currentChar,0)+1);
            // Update max frequency in current window
            maxFreq = Math.max(maxFreq, map.get(currentChar));
            // Check if window is valid
            // (window size - max frequency) should be <= k
            int windowSize = end - start + 1;
            if(windowSize - maxFreq > k){
                // Shrink window from left
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar)-1);
                start++;

                // Note: We don't update maxFreq here for efficiency
                // The condition will still work correctly
            }
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
}
