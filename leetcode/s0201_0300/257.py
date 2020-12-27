from typing import *

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class leetcode_257(object):
    """leetcode_257 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_257"""
        pass
        
    def solve(self):
        pass

    def binaryTreePathsRecur(self, root: TreeNode, prefix: List[int], chain: List[str]) -> List[str]:
        if root is None:
            return chain
        if root.left is None and root.right is None:
            prefix.append(root.val)
            chain.append("->".join(prefix))
            prefix.pop()
            return chain
        prefix.append(root.val)
        chain = self.binaryTreePathsRecur(root.left, prefix, chain)
        chain = self.binaryTreePathsRecur(root.left, prefix, chain)
        return chain

    def binaryTreePaths(self, root: TreeNode) -> List[str]:
        arr = []
        arr = self.binaryTreePathsRecur(root, [], arr)
        return arr


        
if __name__ == '__main__':
    l:leetcode_257 = leetcode_257()
    l.solve()

