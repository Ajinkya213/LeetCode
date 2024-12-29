class MyHashSet {

    int hashSet [];

    public MyHashSet() {
        this.hashSet = new int [1000001];
        for(int i = 0; i < this.hashSet.length ; i++){
            this.hashSet[i] = -1;
        }
    }

    public void add(int key) {
        if(this.hashSet[key] != key){
            this.hashSet[key] = key;
        }
    }

    public void remove(int key) {
        this.hashSet[key] = -1;
    }

    public boolean contains(int key) {
        if(this.hashSet[key] > -1){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */