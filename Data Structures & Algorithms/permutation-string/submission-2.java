class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()){
            return false;
        }

            HashMap<Character,Integer> map1 = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();

            for( int i =0; i<s1.length(); i++){
                char ch1 = s1.charAt(i);
                map1.put(ch1,map1.getOrDefault(ch1,0)+1);
            }




            for( int i = 0 ;i<s1.length();i++){
                char ch2 = s2.charAt(i);
                map2.put(ch2,map2.getOrDefault(ch2,0)+1);
            }

            // if(map1.equals(map2)){
            //     return true;
            // }
          
            for( int i = s1.length();  i<s2.length();  i++){

                if(map1.equals(map2)){

                    return true;
                }

                char ch1 = s2.charAt(i- (s1.length()));
                char ch2 = s2.charAt(i);

                //  System.out.println(map1);
                // System.out.println("this is map2 :");
                // System.out.println(map2);
                // System.out.println("");
                  
                map2.put(ch2,map2.getOrDefault(ch2,0)+1);
                int val = map2.get(ch1);
               
                val--;
                if(val>0){
                         map2.put(ch1,val);
                }else{
                    map2.remove(ch1);
                }
               

              
               
            }

  if(map1.equals(map2)){

                    return true;
                }


        return false;

    }
}
