class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(char ch:tasks)freq[ch-'A']++;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int cnt:freq)if(cnt>0)pq.add(cnt);
        int time=0;
        while(!pq.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int cycle=n+1;
            while(cycle>0 && !pq.isEmpty()){
                int cnt=pq.poll();
                cnt--;
                if(cnt>0)list.add(cnt);
                time++;
                cycle--;
            }
            for(int cnt:list)pq.add(cnt);
            if(pq.isEmpty())break;
            else time+=cycle;
        }
        return time;
    }
}
