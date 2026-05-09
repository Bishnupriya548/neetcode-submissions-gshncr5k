/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int ind=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return solve(preorder,inorder,0,n-1);

    }
    TreeNode solve(int[] pre,int[] in,int st,int end){
        if(st>end)return null;
        int rootval=pre[ind++];
        int i=st;
        for(;i<=end;i++){
            if(in[i]==rootval)break;
        }
       
        TreeNode root=new TreeNode(rootval);
        root.left=solve(pre,in,st,i-1);
        root.right=solve(pre,in,i+1,end);
        return root;
    }
}
