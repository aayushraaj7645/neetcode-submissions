class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        if(strs.length ==0){
            return sb.toString();
        }
        int minLength = Integer.MAX_VALUE;
        for( int i =0;i<strs.length ;i++){
            minLength = Math.min(minLength,strs[i].length());
        }
        for( int i =0;i<minLength ;i++){
            flag = true;
        char ch = strs[0].charAt(i);

        for( int j =0;j<strs.length ;j++){
        
            char ch1 = strs[j].charAt(i);
            
            if(ch != ch1){
                flag = false;
                break;
            }
        }
        if(flag){
            sb.append(ch);
        }else{
            break;
        }

        }
        return sb.toString();

    }
}