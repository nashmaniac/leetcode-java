from typing import *

class leetcode_268(object):
    """leetcode_268 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_268"""
        pass
        
    def solve(self):
        pass

    def missingNumber(self, nums: List[int]) -> int:
        return sum([i for i in range(len(nums)+1)])-sum(nums)
        
if __name__ == '__main__':
    l:leetcode_268 = leetcode_268()
    l.solve()

