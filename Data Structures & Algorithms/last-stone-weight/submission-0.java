class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)return stones[0];
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int s:stones)pq.offer(s);
       while(pq.size()>1){
       int p=pq.poll();

         
        int q=pq.poll();
        if(p==q)continue;
        else{
            pq.offer(Math.abs(p-q));
        }
    
       }
       return pq.isEmpty()?0:pq.peek();
    }
}