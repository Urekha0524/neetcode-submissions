class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int item: numbers){
            set.add(item);
        }
        for(Integer item : set){
           // int item_index = new ArrayList<set>().indexOf(item);
            Integer diff = Integer.valueOf(target) - item;
            List<Integer> list = new ArrayList<>(set);
            if(set.contains(diff)){
               //System.out.println(list.indexOf(item)+" "+list.indexOf(diff));
                return new int[]{(list.indexOf(item)+1), (list.indexOf(diff)+1)};
            }
        }
        return new int[]{};
    }
}
