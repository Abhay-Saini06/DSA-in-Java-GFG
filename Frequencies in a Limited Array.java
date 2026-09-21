class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap <Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        ArrayList<Integer> num = new ArrayList<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i =  1;i<=n;i++){
            num.add(map.getOrDefault(i,0));
        }
        return num;
    }
}
