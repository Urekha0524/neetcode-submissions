class Solution {
    public int search(int[] nums, int target) {
        int mid = nums.length/2;
        System.out.println(mid);
        int index;
        int end;
        if(target >= nums[mid]){
            index = mid;
            end = nums.length;
            while(index<end){
                if(target==nums[index])
                  return index;
              index++;
            }
        }
        else{
            index = 0;
            end = mid;
            while(index<end){
                if(target==nums[index])
                  return index;
              index++;
            }
        }

      return -1;    
    }
}
