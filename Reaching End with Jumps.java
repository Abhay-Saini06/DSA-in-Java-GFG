class Solution {
    public boolean canReach(int[] arr) {
        int farthest = 0;
        for(int i = 0;i<arr.length;i++){
            if(i>farthest) return false;
            farthest = Math.max(farthest,i+arr[i]);
            if(farthest>=arr.length-1) return true;
        }
        return true;
    }
}
