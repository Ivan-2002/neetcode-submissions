class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    // Decodes a single string back to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            // Find the separator #
            int j = i;
            while (s.charAt(j) != '#') j++;
            
            // Extract length
            int length = Integer.parseInt(s.substring(i, j));
            // Extract the string of that length
            String str = s.substring(j + 1, j + 1 + length);
            result.add(str);
            // Move to the next encoded string
            i = j + 1 + length;
        }
        return result;
    }
}
