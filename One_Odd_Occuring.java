class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here 
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet() ){
            if(map.get(i)%2 != 0){
                return i;
            }
        }
        return -1;
    }
}
