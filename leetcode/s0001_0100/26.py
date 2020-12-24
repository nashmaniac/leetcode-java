from typing import *

class leetcode_26(object):
    """leetcode_26 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_26"""
        pass
        
    def solve(self):
        pass

    def removeDuplicates(self, nums: List[int]) -> int:
        pos = 1
        count = 0
        if len(nums) == 0:
            return 0
        if len(nums) == 1:
            return 1

        for i in range(1, len(nums)):
            if nums[i] > nums[i-1]:
                nums[pos] = nums[i]
                pos += 1
            else:
                count += 1

        return len(nums)-count
        
if __name__ == '__main__':
    l:leetcode_26 = leetcode_26()
    l.solve()

