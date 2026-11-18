class Solution {
    String remConsonants(String s){
        String vowels = "aeiouAEIOU";
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) != -1){
                ans.append(ch);
                
            }
            
        }
        return ans.toString();
        
    }
    
}
