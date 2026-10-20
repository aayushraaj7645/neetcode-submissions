class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i =0;i<nums.length ;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(map.get(b), map.get(a))
        );
       
        pq.addAll(map.keySet());
  if(pq.size()==1){
            return new int[]{pq.poll()};
        }
        return new int[]{pq.poll(),pq.poll()};

    }
}
