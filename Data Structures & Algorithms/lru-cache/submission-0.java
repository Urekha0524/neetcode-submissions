class LRUCache {
    private Map<Integer, Integer> lRUCache;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        lRUCache = new LinkedHashMap<>(capacity, 0.75f, true);
    }
    
    public int get(int key) {
        return lRUCache.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        lRUCache.put(key, value);
        if(lRUCache.size() > capacity){
        Integer first = lRUCache.entrySet().iterator().next().getKey();
        lRUCache.remove(first);
        }
        
    }
}
