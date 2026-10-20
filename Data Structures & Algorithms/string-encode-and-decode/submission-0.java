class Solution {

    public String encode(List<String> strs) {

      
       StringBuilder sb = new StringBuilder();
    for( String s : strs){
        sb.append(s);
        sb.append('#');

    }
    String str = sb.toString();

return str;


    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int j =0;
        for( int i =0;i<str.length() ;i++){
            if (str.startsWith("#", i)){
                list.add(str.substring(j,i));
                j=i+1;
            }
        }
        return list;


    }
}
