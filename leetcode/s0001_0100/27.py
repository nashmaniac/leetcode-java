from typing import *


class leetcode_27(object):
    """leetcode_27 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_27"""
        pass

    def solve(self):
        pass

    def removeElement(self, nums: List[int], val: int) -> int:
        count = 0
        pos = 0
        for i in range(len(nums)):
            if nums[i] != val:
                nums[pos] = nums[i]
                pos +=1
            else:
                count += 1
        return len(nums)-count




if __name__ == '__main__':
    l: leetcode_27 = leetcode_27()
    l.solve()
