class Solution {
    public int maxArea(int[] heights) {
       int maxHeight = 0;
       int i =0, j=heights.length-1;
       while(i < j){
          int minHeight = (heights[i]< heights[j]) ? heights[i] : heights[j];
          int capacity = minHeight *(j-i);
          maxHeight = Math.max(capacity, maxHeight);
          if(heights[i] < heights[j]){
            i++;
          }
          else{
            j--;
          }
       }
       return maxHeight;
    }
}
