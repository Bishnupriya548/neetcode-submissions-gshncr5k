

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        d=0
        def height( root: Optional[TreeNode]) -> int:
            nonlocal d
            if not root:
                return 0
            l=height(root.left)
            r=height(root.right)
            d=max(d,l+r)
            return max(l,r)+1
        height(root)
        return d


        