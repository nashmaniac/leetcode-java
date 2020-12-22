from typing import *


class leetcode_977(object):
    """leetcode_977 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_977"""
        pass

    def solve(self):
        pass

    def sortedSquares(self, nums: List[int]) -> List[int]:
        for i in range(0, len(nums)):
            nums[i] = nums[i]*nums[i]
        return sorted(nums)



if __name__ == '__main__':
    l: leetcode_977 = leetcode_977()
    l.solve()
