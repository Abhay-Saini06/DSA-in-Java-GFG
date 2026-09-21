class Solution {
    boolean twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i = 0; i < arr.length; i++){
            int needed = target - arr[i];

            if(map.containsKey(needed)){
                if(needed != arr[i] || map.get(needed) > 1){
                    return true;
                }
            }
        }

        return false;
    }
}
