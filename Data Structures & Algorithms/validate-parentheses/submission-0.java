class Solution {
    public boolean isValid(String s) {
        // if(s.length() % 2 != 0){
        //     return false;
        // }
        
        Stack<Character> stack = new Stack<>();

        for( int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                if(ch==']'||ch=='}'||ch==')'){
                    return false;
                }
            }
             if(ch=='['||ch=='{'||ch=='('){
                stack.add(ch);
            }
             if((ch ==']' && stack.peek()!= '[')||
            (ch =='}' && stack.peek()!= '{')||
            (ch ==')' && stack.peek()!= '(')
            ){
                return false;
            }
            if((ch ==']' && stack.peek() == '[')||
            (ch =='}' && stack.peek()== '{')||
            (ch ==')' && stack.peek()== '(')
            ){
                stack.pop();
            }

            
    //    System.out.println(stack);
            
        }
 return stack.isEmpty();
    }
}
