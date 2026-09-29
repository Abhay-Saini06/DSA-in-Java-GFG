class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0;
        int j = 0;
        int count = 0;
        int max = 0;
        while(i<arr.length){
            if(arr[i]<=dep[j]){
                count++;
                max = Math.max(max,count);
                i++;
            }else{
                count--;
                j++;
                
            }
        }
        return max;
    }
}
