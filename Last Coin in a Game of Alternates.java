class Solution {
    public int coin(int[] arr) {
        // code here
        TreeSet<Integer> map = new TreeSet<>();
        for(int n : arr){
            map.add(n);
        }
        return map.first();
    }
}
