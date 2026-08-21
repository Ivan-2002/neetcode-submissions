class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // Base cases
        prefix[0] = 1;
        suffix[n - 1] = 1;

        // Build prefix array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Build suffix array
        for (int j = n - 2; j >= 0; j--) {
            suffix[j] = suffix[j + 1] * nums[j + 1];
        }

        // Build result
        for (int k = 0; k < n; k++) {
            nums[k] = prefix[k] * suffix[k];
        }

        return nums;
    }
}  
