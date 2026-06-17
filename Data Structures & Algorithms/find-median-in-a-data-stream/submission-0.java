class MedianFinder {
 private ArrayList<Integer> ans;
    public MedianFinder() {
        ans=new ArrayList<>();
    }
    
    public void addNum(int num) {
        ans.add(num);
    }
    
    public double findMedian() {
        Collections.sort(ans);
        int n=ans.size();
        if(n%2!=0){
            return ans.get(n/2);
        }
        else{
            return (ans.get(n/2)+ans.get(n/2-1))/2.0;
        }
    }
}
