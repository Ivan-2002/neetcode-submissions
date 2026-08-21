class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            // convert to char array and sort
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            // add the word to the map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
