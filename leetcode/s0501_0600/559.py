from typing import *


class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children


class leetcode_559(object):
    """leetcode_559 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_559"""
        pass

    def solve(self):
        pass

    def maxDepthRecur(self, root: 'Node', level: int, arr: List[tuple]) -> List[tuple]:
        if root is None:
            return arr

        arr.append((root.val, level + 1))
        for i in root.children:
            arr = self.maxDepthRecur(i, level + 1, arr)
        return arr

    def maxDepth(self, root: 'Node') -> int:
        arr = []
        arr = self.maxDepthRecur(root, 0, arr)
        if not arr:
            return 0
        arr = sorted(arr, lambda x: -x[1])
        return arr[0][1]

    def maxDepth1(self, root: 'Node') -> int:
        if root is None:
            return 0

        height = 0
        for i in root.children:
            height = max(height, self.maxDepth(i))

        return 1 + height


if __name__ == '__main__':
    l: leetcode_559 = leetcode_559()
    l.solve()
