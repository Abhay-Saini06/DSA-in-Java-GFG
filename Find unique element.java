class Solution {
    public int uniqueElement(int[] arr, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) == 1 ){
                return i;
            }
        }
        return -1;
    }
}
