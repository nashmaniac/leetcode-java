from typing import *

class leetcode_9(object):
    """leetcode_9 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_9"""
        pass

    def solve(self):
        pass

    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        if x < 10:
            return True

        a = []
        while x > 0:
            a.insert(0, int(x%10))
            x = x// 10

        l = 0
        r = len(a)-1
        while l<r:
            if a[l] != a[r]:
                return False

            l += 1
            r -= 1

        return True



if __name__ == '__main__':
    l:leetcode_9 = leetcode_9()
    l.solve()

