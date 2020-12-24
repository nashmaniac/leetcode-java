from typing import *
import sys

class leetcode_1446(object):
    """leetcode_1446 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_1446"""
        pass

    def solve(self):
        self.maxPower("cc")

    def maxPower(self, s: str) -> int:
        last = s[0]
        count = 1
        max = count
        for i in s[1:]:
            if i != last:
                if count > max:
                    max = count
                count = 1
            else:
                count += 1
            last = i


        return max if max > count else count


if __name__ == '__main__':
    l: leetcode_1446 = leetcode_1446()
    l.solve()
