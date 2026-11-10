class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for( String s :emails){
            StringBuilder sb = new StringBuilder();
            boolean flag = true;
            int reached =0;
      for( int i =0;i<s.length() ;i++){

      char c = s.charAt(i);
            if(c=='@'&& reached ==0){
                reached =1;
                flag = true;
            } 
            if(!flag){
                continue;
            }
            if(c =='.' && reached ==0){
                continue;
            }else if(c== '+' && reached ==0){
                flag = false;
                continue;
            }
           
          
            
            sb.append(c);

           
         }
         set.add(sb.toString());
        }
        return set.size();
        
        
    }
}