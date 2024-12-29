class MyHashSet {
    private int primarySize;
    private int secondarySize;
    private boolean[][] buckets;

    public MyHashSet() {
        primarySize = 1001;
        secondarySize = 1000;
        buckets = new boolean[primarySize][];
    }

    public void add(int key) {
        int p = key/primarySize;
        int s = key%secondarySize;
        if (buckets[p]==null)
            buckets[p]=new boolean[secondarySize];
        buckets[p][s]=true;
    }

    public void remove(int key) {
        int p = key/primarySize;
        int s = key%secondarySize;
        if (buckets[p]==null)
            return;
        buckets[p][s]=false;
    }

    public boolean contains(int key) {
        int p = key/primarySize;
        int s = key%secondarySize;
        if (buckets[p]==null)
            return false;
        return buckets[p][s];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */