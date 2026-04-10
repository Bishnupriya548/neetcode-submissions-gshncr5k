# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True
        def height(root)->int:
            if not root:
                return 0
            return max(height(root.left),height(root.right))+1
        l=height(root.left)
        r=height(root.right)
        if abs(l-r)<=1 and self.isBalanced(root.left) and self.isBalanced(root.right):
            return True
        return False
        