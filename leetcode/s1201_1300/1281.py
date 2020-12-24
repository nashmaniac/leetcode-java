from typing import *

class leetcode_1281(object):
    """leetcode_1281 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_1281"""
        pass

    def solve(self):
        self.subtractProductAndSum(234)

    def subtractProductAndSum(self, n: int) -> int:
        m = 0
        s = 1

        if n == 0:
            return 0

        while n > 0:
            m = (m + int(n%10))
            s = (s * int(n%10))

            n = n // 10

        print(m, s)

        return s-m



if __name__ == '__main__':
    l:leetcode_1281 = leetcode_1281()
    l.solve()

