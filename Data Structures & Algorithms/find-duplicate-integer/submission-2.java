class Solution {
    public int findDuplicate(int[] nums) {
       
       int max = Integer.MIN_VALUE;

        for( int i=0 ;i<nums.length ;i++ ){
          max = Math.max(max,nums[i]);
        }

         int[] hash = new int[max+1];
         for(int i =0;i<nums.length;i++){
            hash[nums[i]]++;
            if(hash[nums[i]]>1){
                return nums[i];
            }
         }

        return 0;

       
    }
}
