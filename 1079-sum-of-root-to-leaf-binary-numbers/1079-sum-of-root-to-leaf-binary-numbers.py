# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sumRootToLeaf(self, root):

        def helper(root, currsum):
            if root is None:
                return 0

            currsum = currsum * 2 + root.val

            if root.left is None and root.right is None:
                return currsum

            return helper(root.left, currsum) + helper(root.right, currsum)

        return helper(root, 0)

        