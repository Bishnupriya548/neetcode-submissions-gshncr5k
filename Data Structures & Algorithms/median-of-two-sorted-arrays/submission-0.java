class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums=new int[m+n];
       int i=0;
       int j=0;
       int ind=0;
       while(i<m && j<n){
        if(nums1[i]<=nums2[j]){
          nums[ind]=nums1[i];
          ind++;
          i++;
        }
        else{
            nums[ind]=nums2[j];
          ind++;
          j++;
        }
       }
       while(i<m){
        nums[ind]=nums1[i];
          ind++;
          i++;
       }
       while(j<n){
          nums[ind]=nums2[j];
          ind++;
          j++;
        
       }
       int total = m + n;

        if(total % 2 != 0){
            return (double) nums[total/2];
        }

        int a = total/2 - 1;
        int b = total/2;

        return (nums[a] + nums[b]) / 2.0;
    }
}
