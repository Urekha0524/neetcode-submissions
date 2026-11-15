class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int remaining = target - nums[i];

            if(hashmap.containsKey(remaining)){
                int j = hashmap.get(remaining);
                return (i<j) ? new int[]{i,j} : new int[]{j,i};
            }
            hashmap.put(nums[i],i);
            
        }
        return new int[0];        
    }
}
