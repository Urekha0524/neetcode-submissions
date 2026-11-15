class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i_min = nums.length;
        int j_min = nums.length;
        int[] output = new int[2];
          for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if((nums[i] + nums[j]) == target){
                      if(i_min > i)
                        i_min = i;
                      if(j_min > j)
                        j_min = j;
                }
            }
          }
          output[0] = i_min;
          output[1] = j_min;
        return output;
    }
}
