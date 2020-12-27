from typing import *


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class leetcode_965(object):
    """leetcode_965 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_965"""
        pass
        
    def solve(self):
        pass

    def isUnivalTreeRecur(self, root: TreeNode, val: int) -> bool:
        if root is None:
            return True

        if root.val != val:
            return False

        return self.isUnivalTreeRecur(root.left, val) and self.isUnivalTreeRecur(root.right, val)

    def isUnivalTree(self, root: TreeNode) -> bool:
        if root is None:
            return True
        val = root.val
        return self.isUnivalTreeRecur(root, val)



if __name__ == '__main__':
    l:leetcode_965 = leetcode_965()
    l.solve()

