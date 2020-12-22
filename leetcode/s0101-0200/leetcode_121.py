from typing import *
import sys


class leetcode_121(object):
    """leetcode_121 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_121"""
        pass

    def solve(self):
        pass

    def maxProfit(self, prices: List[int]) -> int:
        minValue: int = sys.maxsize
        max_profit: int = 0
        for i in prices:
            if i<minValue:
                minValue = i
            elif i-minValue > max_profit:
                max_profit = i-minValue

        return max_profit



if __name__ == '__main__':
    l: leetcode_121 = leetcode_121()
    l.solve()
