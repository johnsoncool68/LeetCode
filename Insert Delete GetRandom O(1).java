class RandomizedSet {

    Map randomSet;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        if(randomSet == null)
            randomSet = new HashMap();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        String valS = String.valueOf(val);
        if(!randomSet.containsKey(valS)){
            randomSet.put(valS,val);
            return true;
        }else{
            return false;
        } 
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        String valS = String.valueOf(val);
        if(randomSet.containsKey(valS)){
            randomSet.remove(valS);
            return true;
        }else{
            return false;
        } 
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        List<Integer> valuesList = new ArrayList<Integer>(randomSet.values());
        int randomIndex = new Random().nextInt(valuesList.size());
        Integer randomValue = valuesList.get(randomIndex);
        
        return randomValue;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
