from typing import *
import sys
class leetcode_485(object):
    """leetcode_485 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_485"""
        pass
        
    def solve(self):
        # print(self.findMaxConsecutiveOnes([1,1,0,1,1,1]))
        print(self.findMaxConsecutiveOnes([1,0,1,1,0,1]))

    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = max_count = 0
        for num in nums:
            if num == 1:
                # Increment the count of 1's by one.
                count += 1
            else:
                # Find the maximum till now.
                max_count = max(max_count, count)
                # Reset count of 1.
                count = 0
        return max(max_count, count)

        
if __name__ == '__main__':
    l:leetcode_485 = leetcode_485()
    l.solve()

