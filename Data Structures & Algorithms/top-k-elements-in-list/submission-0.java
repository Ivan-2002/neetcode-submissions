class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Count frequencies
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }    

        // Max heap based on frequencies 
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freq.entrySet());

        // Extract top k element
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = maxHeap.poll().getKey();
        }

        return result;
    }
}
