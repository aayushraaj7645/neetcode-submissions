class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backTrack(result,list,nums,target,0);
        return result;
    }
    public void backTrack(List<List<Integer>> result , List<Integer> list ,int[] nums, int remaining , int index){


          if (remaining == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        
       
        for( int i =index;i<nums.length;i++){

              if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] > remaining) {
                break;
            }
            list.add(nums[i]);
       
            backTrack(result,list,nums,remaining- nums[i],i+1);
         
            list.remove(list.size()-1);
        }

    }
}
