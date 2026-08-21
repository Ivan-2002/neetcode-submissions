class Solution {
    public int maxArea(int[] heights) {
        int maxContainer = 0;
        int tempContainer = 0;
        int n = heights.length;
        int minHeight;
        int left = 0;
        int right = n-1;

        while(left<right){
            minHeight = (heights[left]<heights[right]) ? heights[left] : heights[right];
            tempContainer = minHeight * ((right+1) - (left+1));
            if(tempContainer > maxContainer){
                maxContainer = tempContainer;
            }
            if(heights[left] > heights[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxContainer; 
    }
}
