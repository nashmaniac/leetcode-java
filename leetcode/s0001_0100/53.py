from typing import *
import sys


class leetcode_53(object):
    """leetcode_53 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_53"""
        pass

    def maxSubArrayLinearTime(self, nums: List[int]) -> int:
        maxSum = -sys.maxsize
        currSum = 0
        for i in nums:
            currSum = max(i, currSum + i)
            maxSum = max(currSum, maxSum)
        return maxSum

    def crossSum(self, nums: List[int], start: int, end: int, mid: int):
        if start == end:
            return nums[start]

        leftSubSum = -sys.maxsize
        rightSubSum = -sys.maxsize

        sum = 0
        for i in range(mid, start-1, -1):
            sum += nums[i]
            leftSubSum = max(leftSubSum, sum)

        sum = 0
        for i in range(mid+1, end+1):
            sum += nums[i]
            rightSubSum = max(rightSubSum, sum)
        return leftSubSum + rightSubSum

    def maxSubArrayInRecursive(self, nums: List[int], start: int, end: int) -> int:
        if start == end:
            return nums[start]
        mid = int((start+end)/2)
        left = self.maxSubArrayInRecursive(nums, start, mid)
        right = self.maxSubArrayInRecursive(nums, mid+1, end)
        crossSum = self.crossSum(nums, start, end, mid)
        return max(left, right, crossSum)

    def maxSubArray(self, nums: List[int]) -> int:
        # return self.maxSubArrayLinearTime(nums)
        return self.maxSubArrayInRecursive(nums, 0, len(nums) - 1)

    def solve(self):
        nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
        print(self.maxSubArray(nums))


if __name__ == '__main__':
    l: leetcode_53 = leetcode_53()
    l.solve()
