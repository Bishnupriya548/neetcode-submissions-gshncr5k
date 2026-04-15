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
    List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        
        dfs(root,0);
        return res;

    }
private void dfs(TreeNode node,int d){
    if(node==null){
        return ;
    }
    if(res.size()==d)res.add(node.val);
    dfs(node.right,d+1);
    dfs(node.left,d+1);
}
}
