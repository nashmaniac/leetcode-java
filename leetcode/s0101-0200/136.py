from typing import *

class leetcode_136(object):
    """leetcode_136 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_136"""
        pass
        
    def solve(self):
        pass

    def singleNumber(self, nums: List[int]) -> int:
        return sum(list(set(nums)))*2-sum(nums)

        
if __name__ == '__main__':
    l:leetcode_136 = leetcode_136()
    l.solve()

