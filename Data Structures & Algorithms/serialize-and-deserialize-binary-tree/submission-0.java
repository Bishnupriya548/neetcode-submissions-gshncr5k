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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
             TreeNode curr = q.poll();

            if (curr == null) {
                sb.append("&,");
                continue;
            }

            sb.append(curr.val).append(",");

            q.offer(curr.left);
            q.offer(curr.right);
        }
return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty())return null;
          String[] arr=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(arr[0]));
        int ind=1;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr= q.poll();
            if(!arr[ind].equals("&")){
                curr.left=new TreeNode(Integer.parseInt(arr[ind]));
                q.add(curr.left);
            }
            ind++;

        
             if(!arr[ind].equals("&")){
                curr.right=new TreeNode(Integer.parseInt(arr[ind]));
                q.add(curr.right);
            }
            ind++;}
        return root;
    }
    
}
