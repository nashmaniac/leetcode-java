from typing import *
import math
class leetcode_7(object):
    """leetcode_7 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_7"""
        pass
        
    def solve(self):
        pass

    def reverse(self, x: int) -> int:
        is_positive = True
        if x < 0:
            is_positive = False
            x = -x

        if is_positive and x < 10:
            return x

        rev = 0
        while x > 0:
            temp = x % 10
            rev = rev * 10 + temp
            x = x // 10

            if rev > math.pow(2, 31):
                return 0

        if not is_positive:
            return -1 * rev
        return rev


        
if __name__ == '__main__':
    l:leetcode_7 = leetcode_7()
    l.solve()

