from typing import *

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class leetcode_938(object):
    """leetcode_938 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_938"""
        pass
        
    def solve(self):
        pass

    def rangeSumBST(self, root: TreeNode, low: int, high: int, sum: int) -> int:
        if root is None:
            return 0
        left: int = self.rangeSumBST(root.left, low, high, sum)
        right: int = self.rangeSumBST(root.right, low, high, sum)
        if low <= root.val <= high:
            return sum + root.val + left + right
        return sum + left + right


    def rangeSumBST(self, root: TreeNode, low: int, high: int) -> int:
        return self.rangeSumBST(root, low, high, 0)



        
if __name__ == '__main__':
    l:leetcode_938 = leetcode_938()
    l.solve()

