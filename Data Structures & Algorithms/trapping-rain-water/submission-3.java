class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int result=0;
        if(length==0) return 0;
        
        int leftMax[] = new int[length];
        int rightMax[] = new int[length];

        leftMax[0] = height[0];
        rightMax[length-1] = height[length-1];
        for(int i=1; i< length; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        System.out.println(Arrays.toString(leftMax));
        for(int j=length-2; j>=0; j--){
            rightMax[j] = Math.max(rightMax[j+1],height[j]);
        }
        System.out.println(Arrays.toString(rightMax));
        for(int i=0; i<length; i++){
            result = result + (Math.min(leftMax[i], rightMax[i])-height[i]);
        }
   return result;
        
    }
}
