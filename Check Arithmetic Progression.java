class Solution {
    // Function to check if the given array forms an arithmetic progression
    public boolean checkIsAP(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i+1] - arr[i] != diff){
                return false;
            }
        }
        return true;
    }
}
