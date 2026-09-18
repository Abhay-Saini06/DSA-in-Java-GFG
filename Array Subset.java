
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        if(a.length<b.length) return false;
        for(int i : a){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int j : b){
            map2.put(j,map2.getOrDefault(j,0)+1);
        }
        for(int i : b){
            if(!map1.containsKey(i) || map1.get(i)<map2.get(i)){
                return false;
            }
        }
        return true;
    }
}
