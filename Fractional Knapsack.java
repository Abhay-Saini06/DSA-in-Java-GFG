class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        ArrayList<double[]> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            double ratio = (double) val[i]/wt[i];
            list.add(new double[]{val[i], wt[i], ratio});
        }
        
        list.sort((a, b) -> Double.compare(b[2], a[2]));
        double sum = 0;

        for(int i = 0; i < n; i++) {

            double value = list.get(i)[0];
            double weight = list.get(i)[1];
            double ratio = list.get(i)[2];

            if(weight <= capacity) {
                sum += value;
                capacity -= weight;
            }
            else {
                sum += ratio * capacity;
                break;
            }
        }

        return sum;
        
    }
}
