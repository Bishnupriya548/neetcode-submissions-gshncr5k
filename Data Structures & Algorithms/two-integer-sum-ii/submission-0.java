class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int k=target;
        int i=0,j=n-1;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==k)return new int[]{i+1,j+1};
            else if(sum>k)j--;
            else i++;
        }
        return new int[]{-1,-1};
    }
}
