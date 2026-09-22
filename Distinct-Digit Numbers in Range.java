class solution {
    ArrayList<Integer> uniqueNumbers(int l, int r) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = l; i <= r; i++) {

            int num = i;
            boolean[] used = new boolean[10];
            boolean unique = true;

            while (num > 0) {
                int digit = num % 10;

                if (used[digit]) {
                    unique = false;
                    break;
                }

                used[digit] = true;
                num = num / 10;
            }

            if (unique) {
                ans.add(i);
            }
        }

        return ans;
    }
}
