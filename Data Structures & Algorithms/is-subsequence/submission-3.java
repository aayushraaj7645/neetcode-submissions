class Solution {
    public boolean isSubsequence(String s, String t) {
        int last =-1;
        for( int i =0;i<s.length();i++){
            char ch1 = s.charAt(i);
            int pre = last;
            for( int j =i;j<t.length();j++){
                char ch2 = t.charAt(j);
                if(ch1 == ch2 && j>last){
                    last = j;
                    break;
                }
            }
            if(pre >= last){
                
                return false;
            }
        }
        return true;
        
    }
}