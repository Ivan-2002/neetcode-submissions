class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // 1. Target found
            if (nums[mid] == target) {
                return mid; 
            }

            // 2. Determine if the LEFT half is sorted
            if (nums[low] <= nums[mid]) {
// Check if the target is within the range of this sorted left half
            if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1; // Target is here, discard right half
            } else {
                    low = mid + 1;  // Target is NOT here, discard left half
                }
            } 
            // 3. Otherwise, the RIGHT half must be sorted
            else {
                // Check if the target is within the range of this sorted right half
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1; // Target is here, discard left half
                } else {
                    high = mid - 1; // Target is NOT here, discard right half
                }
            }
        }
        
        return -1; // Target not found
    }
}