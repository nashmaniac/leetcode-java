from typing import *


class leetcode_70(object):
    """leetcode_70 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_70"""
        pass

    def solve(self):
        print(self.climbStairs(4))

    def climbStairs(self, n: int) -> int:
        a = [0, 1, 2]
        if n == 0 or n == 1 or n == 2:
            return a[n]
        for i in range(3, n+1):
            # print(i)
            a.append(a[i-1]+a[i-2])
        return a[n]



if __name__ == '__main__':
    l: leetcode_70 = leetcode_70()
    l.solve()
