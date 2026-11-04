class Solution {
    public int countSeniors(String[] details) {
        int result=0;
        for( int i =0;i<details.length ;i++){
           String s =  details[i];
           char c = s.charAt(11);
           char c2 = s.charAt(12);
           StringBuilder sb  = new StringBuilder();
           sb.append(c);
           sb.append(c2);

            String s1 = sb.toString();
            System.out.println(s1);
            int val = Integer.valueOf(s1);
            if(val>60){
                result++;
            }
           
        }
        return result;
    }
}