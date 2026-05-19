/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        dfs1(root,sb);
        return sb.toString();
    }
    void dfs1(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("null,");
            return ;
        }
        sb.append(root.val).append(",");
        dfs1(root.left,sb);
        dfs1(root.right,sb);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        int[] ind=new int[1];
        return dfs2(arr,ind);
    }
    TreeNode dfs2(String[] arr,int[] ind){
        if(arr[ind[0]].equals("null")){
            ind[0]++;
            return null;

        }
        TreeNode root=new TreeNode(Integer.parseInt(arr[ind[0]]));
        ind[0]++;
        root.left=dfs2(arr,ind);
        root.right=dfs2(arr,ind);
        return root;


    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));