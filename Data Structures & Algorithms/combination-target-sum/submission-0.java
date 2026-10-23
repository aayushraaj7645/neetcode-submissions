class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backTrack(result,list,nums,target,0,0);
        return result;
    }

    public void backTrack(List<List<Integer>> result ,List<Integer> list ,int[] nums ,int target, int index,int sum){

if(sum> target){
    return ;
}
else if(sum == target){
result.add(new ArrayList<>(list));
return ;
}
for( int i =index;i<nums.length;i++){
    list.add(nums[i]);
    sum +=  nums[i];
    backTrack(result, list, nums, target, i,sum);
    sum -= list.get(list.size()-1);
    list.remove(list.size()-1);
}
    }
}
