class Solution {
    public int[] productExceptSelf(int[] numbers) {
         int n = numbers.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int initial = 1;
        for(int i = 0;i<numbers.length;i++){
            prefix[i] = initial;
            initial *= numbers[i];
        }
        int last =1;
        for( int i = numbers.length-1 ; i>=0 ; i--){
            suffix[i] = last;
            last *= numbers[i];
        }
        int[] result = new int[n];
        for( int i =0;i<numbers.length ;i++){
            result[i] = prefix[i]* suffix[i];
        }

        return result;
        

    }
}  
