class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int [] ans = new int[2];
        int index = 0;
        for(int i : arr){
            if(map.get(i) == 1){
                ans[index] = i;
                index++;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
