class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
       for( int i =0;i<nums.length ;i++){
        map.put(nums[i],i);
       }
        List<List<Integer>> result = new ArrayList<>();
        for( int i =0;i<nums.length ;i++){
            
            for( int j=i+1;j<nums.length ;j++){
           
                int num = nums[i]+nums[j];
                if(map.containsKey(0-num)){
                    int val = map.get(0-num);
                    if(val > i && val > j ){
                         List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(0-num);
                   if(!result.contains(new ArrayList<>(list))){
                      result.add(new ArrayList<>(list));}
                      
                    }
                }
              
            }
        }

        return result;
        
    }
}
