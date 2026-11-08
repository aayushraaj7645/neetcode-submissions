class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        boolean first = true;
        boolean second = true;
        for( int i =0;i<t.length() ;i++){
              if(!map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),t.charAt(i));
        }else{
            char c = map.get(s.charAt(i));
            if(c != t.charAt(i)){
                first = false ;
                break;
            }
        }}
        for( int i =0; i<s.length(); i++){
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),s.charAt(i));
            }else{
                char ch = map2.get(t.charAt(i));
                if(ch != s.charAt(i)){
                    second = false;
                    break;
                }
            }
        }

        
        return first && second;
    }
}