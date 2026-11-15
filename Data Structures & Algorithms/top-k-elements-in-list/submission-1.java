class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int val: nums){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        
        List<int[]> array = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            array.add(new int[]{entry.getValue(), entry.getKey()});
        }
        array.sort((a,b)-> b[0]-a[0]);

        int[] endArray = new int[k];
        for(int i=0; i< k; i++){
            endArray[i] = array.get(i)[1];
        }
        return endArray;
    }
}
