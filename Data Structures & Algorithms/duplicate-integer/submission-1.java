class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer item: nums){
           map.put(item, map.getOrDefault(item,0)+1);
        }
        Set<Integer> keyset = map.keySet();
        for(Integer item: keyset){
            int value = map.get(item);
            if(value >1){
                flag = true;
            }
        }
        return flag;
    }
}