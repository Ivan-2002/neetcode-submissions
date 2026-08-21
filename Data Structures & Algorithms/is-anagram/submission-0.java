class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[128]; // ASCII

        for (char c : s.toCharArray()) freq[c]++;
        for (char c : t.toCharArray()) freq[c]--;

        for (int f : freq) if (f != 0) return false;

        return true;
    }
}
