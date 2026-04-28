class KthLargest {
int a;
    PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue<>(k);
        for(int num:nums)pq.add(num);
        a=k;
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size()>a)pq.poll();
        return pq.peek();
}}
