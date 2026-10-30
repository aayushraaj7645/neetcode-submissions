class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(result,list,nums,0);
        return result;
    }
    public void backtrack(List<List<Integer>> result, List<Integer> list , int[] nums,int index){
        result.add(new ArrayList<>(list));

        for( int i =index;i<nums.length ;i++){
            if(i>index && nums[i] == nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            backtrack(result,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
