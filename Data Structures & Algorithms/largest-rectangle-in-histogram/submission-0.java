class Solution {
    public int largestRectangleArea(int[] heights) {
       int n=heights.length;
       int max=0;
       for(int i=0;i<n;i++){
        int h=heights[i];
        int right=i+1;
        while(right<n && heights[right]>=h){
            right++;
        }
        int left=i;
        while(left>=0 && heights[left]>=h){
            left--;
        }
        right--;
        left++;
        max=Math.max(max,h*(right-left+1));
       } 
       return max;
    }
}
