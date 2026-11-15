class Solution {
    public int findDuplicate(int[] nums) {
       
       HashSet<Integer> hashSet = new HashSet<>();

       for(int val: nums){
        if(!hashSet.add(val))
          return val;
       }
       return -1;
    }
}
