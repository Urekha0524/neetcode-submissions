class Solution {
    public int maxArea(int[] heights) {
        
        int maxCon =0;
        int l=0, r= heights.length-1;
        while (l<r){
            maxCon = Math.max(maxCon, Math.min(heights[l], heights[r]) *(r-l));
            if(heights[l] < heights[r]) l++;
            else if(heights[r] < heights[l]) r--;
            else{
                l++;
                r--;
            }
        }
        return maxCon;
    }
}
