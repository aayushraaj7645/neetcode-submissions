class Solution {
    public int appendCharacters(String s, String t) {
        int i =0;
        int j =0;
        while(i<s.length() && j<t.length()){
            char c = t.charAt(j);
            if(s.charAt(i)== c){
                j++;
                i++;
            }else{
                i++;
            }

        }
        return t.length()-j;
        
    }
}