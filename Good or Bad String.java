class Solution {
    boolean isGoodOrBad(String s) {

        int vowel = 0;
        int consonant = 0;

        for (char ch : s.toCharArray()) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {

                vowel++;
                consonant = 0;

            } else if (ch == '?') {

                vowel++;
                consonant++;

            } else {

                consonant++;
                vowel = 0;
            }

            if (vowel > 5 || consonant > 3) {
                return false;
            }
        }

        return true;
    }
}
