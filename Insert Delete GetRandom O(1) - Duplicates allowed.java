class RandomizedCollection {
    List<Integer> rc = null;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        if(rc == null);
            rc = new ArrayList<>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        boolean isExist = false;
        if(rc.contains(val)){
            isExist = false;
        }else{
            isExist = true;
        }
        
        rc.add(val);
        return isExist;
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
                boolean isExist = false;
        if(rc.contains(val)){
            rc.remove(new Integer(val));
            isExist = true;
        }else{
            isExist = false;
        }    
        return isExist;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        int val = 0;
        if(rc.size()>0){
            try{
                int random = (int) (Math.random()*rc.size());
                val = rc.get(random);
            }catch(Exception e){
                
            }
        }
        return val;
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
