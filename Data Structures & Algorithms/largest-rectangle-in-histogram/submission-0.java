class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int largestRectangle = 0;

        for (int i = 0; i < n; i++) {
            int minHeight = heights[i];

            for (int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                int width = j - i + 1;
                int area = minHeight * width;
                largestRectangle = Math.max(largestRectangle, area);
            }
        }

        return largestRectangle;
    }
}