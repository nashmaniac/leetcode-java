from typing import *


class leetcode_283(object):
    """leetcode_283 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_283"""
        pass

    def solve(self):
        pass

    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        pos = 0
        for id, i in enumerate(nums):
            if i != 0:
                nums[pos], nums[id] = i, nums[pos]
                pos += 1



if __name__ == '__main__':
    l: leetcode_283 = leetcode_283()
    l.solve()
