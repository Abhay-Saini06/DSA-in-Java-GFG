class Solution {
    static int countDistinct(int arr[]) {
        HashSet <Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        return set.size();
        
    }
}
