from typing import *


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class leetcode_1469(object):
    """leetcode_1469 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_1469"""
        pass

    def solve(self):
        pass

    def getLonelyNodesRecur(self, root: TreeNode, arr: List[int]) -> List[int]:
        if root.left is None and root.right is None:
            return arr
        if root.left is None and root.right is not None:
            arr.append(root.right.val)
        if root.left is not None and root.right is None:
            arr.append(root.left.val)

        if root.left is not None:
            arr = self.getLonelyNodesRecur(root.left, arr)
        if root.right is not None:
            arr = self.getLonelyNodesRecur(root.right, arr)
        return arr

    def getLonelyNodes(self, root: TreeNode) -> List[int]:
        arr = []
        arr = self.getLonelyNodesRecur(root, arr)
        return arr


if __name__ == '__main__':
    l: leetcode_1469 = leetcode_1469()
    l.solve()
