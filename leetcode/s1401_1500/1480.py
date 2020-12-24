from typing import *

class leetcode_1480(object):
    """leetcode_1480 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_1480"""
        pass
        
    def solve(self):
        pass

    def runningSum(self, nums: List[int]) -> List[int]:
        for i in range(1, len(nums)):
            nums[i] += nums[i-1]
        return nums
        
if __name__ == '__main__':
    l:leetcode_1480 = leetcode_1480()
    l.solve()

