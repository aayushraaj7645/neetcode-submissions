class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length ==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
      
        int max = 1;
        for( int i =0;i<nums.length ;i++){
            
            if(set.contains(nums[i]+1)){
                continue;
            }
            int length =1;
            int val = nums[i];
            while(set.contains(val-1)){
                length++;
                val--;
            }
            max = Math.max(length,max);
        }
        return max;
    }
}
