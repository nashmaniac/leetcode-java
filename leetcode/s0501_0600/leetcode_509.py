from typing import *


class leetcode_509(object):
    """leetcode_509 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_509"""
        pass

    def solve(self):
        print(self.fib(4))

    def fib(self, n: int) -> int:
        if n == 0:
            return 0
        if n == 1:
            return 1

        total = [0, 1]
        for i in range(2, n+1):
            total.append(total[i-1]+total[i-2])
        return total[n]


if __name__ == '__main__':
    l: leetcode_509 = leetcode_509()
    l.solve()
