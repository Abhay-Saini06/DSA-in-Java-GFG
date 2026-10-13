
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i = i + 2) {
            arr1.add(arr[i]);
        }

        return arr1;
    }
}
