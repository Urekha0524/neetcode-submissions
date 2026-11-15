class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productArray[] = new int[nums.length];
        int product = 1;
        int zeroCount = 0;
        for(int n: nums){
            if(n !=0){
              product *= n;
            }
            else{
               zeroCount++;
            }
        }
        if(zeroCount > 1){
           return new int[nums.length];
        }
        for(int i =0; i< nums.length; i++){
            if(zeroCount > 0){
                productArray[i] = (nums[i]==0) ? product : 0;
            }
            else{
                productArray[i] = product/nums[i];
            }
        }
        return productArray;
        
    }
}  
