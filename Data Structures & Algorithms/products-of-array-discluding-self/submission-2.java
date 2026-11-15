class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[] = new int[nums.length];
        prefix[0]=1;
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        int suffix = 1;
        int result[] = new int[nums.length];
        result[nums.length-1] = prefix[nums.length-1];
        for(int j=nums.length-2; j>=0; j--){
            suffix = suffix * nums[j+1];
            result[j] = suffix * prefix[j];
        }
        return result;
    }
}  
