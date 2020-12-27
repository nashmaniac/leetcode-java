from typing import *

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class leetcode_104(object):
    """leetcode_104 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_104"""
        pass

    def solve(self):
        pass

    def maxDepth(self, root: TreeNode) -> int:
        if root is None:
            return 0

        return 1+max(self.maxDepth(root.left), self.maxDepth(root.right))


if __name__ == '__main__':
    l:leetcode_104 = leetcode_104()
    l.solve()

