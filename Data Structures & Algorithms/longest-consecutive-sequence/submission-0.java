class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sequence = new HashSet<>();

        for(int num : nums){
            sequence.add(num);
        }

        int longest = 0;

        for (int num : sequence){
            int currentNum = num;
            int length = 1;
            while(sequence.contains(currentNum + 1)){
                currentNum++;
                length++;
            }

            longest = Math.max(longest, length);
        }

        return longest;
    }
}
