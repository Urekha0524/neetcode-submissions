class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, target, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int remaining, int[] nums, List<Integer> path, List<List<Integer>> result){
       if(remaining == 0){
        result.add(new ArrayList<>(path));
        return;
       }
       for(int i = start; i< nums.length; i++){
           int val = nums[i];
           if(val > remaining) break;
           path.add(val);
           backtrack(i, remaining-val, nums, path, result);
           path.remove(path.size()-1);
       }
    }
}
