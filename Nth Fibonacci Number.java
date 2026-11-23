import java.util.HashMap;
class Solution {
    static HashMap<Integer,Integer> map = new HashMap<>();
    static int nthFibonacci(int n) {
    if(n<=1) return n;
    if(map.containsKey(n)) return map.get(n);
    int ans = nthFibonacci(n-1) + nthFibonacci(n-2);
    map.put(n,ans);
    return ans;
    }
}
