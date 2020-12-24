from typing import *


class leetcode_344(object):
    """leetcode_344 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_344"""
        pass

    def solve(self):
        pass

    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        m = len(s)
        for i in range(m//2):
            s[i], s[m-1-i] = s[m-1-i], s[i]



if __name__ == '__main__':
    l: leetcode_344 = leetcode_344()
    l.solve()
