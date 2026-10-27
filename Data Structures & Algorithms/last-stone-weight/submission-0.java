class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for( int num : stones){
            pq.add(num);
        }
        while(pq.size()!=1){
            int large = pq.poll();
            int sec = pq.poll();
            int val = Math.abs(large-sec);
            pq.add(val);
        }

        return pq.poll();

    }
}
