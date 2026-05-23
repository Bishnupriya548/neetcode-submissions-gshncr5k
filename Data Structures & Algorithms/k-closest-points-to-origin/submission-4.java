class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparing(a->a[0]));
        for(int[] p:points){
            int d=p[0]*p[0]+p[1]*p[1];
            pq.offer(new int[]{d,p[0],p[1]});

        }
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            int[] p=pq.poll();
            ans[i]=new int[]{p[1],p[2]};
        }
        return ans;

    }
}
