class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(numbers[i]+numbers[j] == target && numbers[i] != numbers[j]){
                    return new int[]{i+1, j+1};
                }
            }
        }
        return null;
    }
}
