from typing import *


class leetcode_88(object):
    """leetcode_88 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_88"""
        pass

    def solve(self):
        self.merge(
            [0],
            0,
            [1],
            1
        )

    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        index = len(nums1)-1

        if m>0 and n>0:
            while m>0 and n>0:
                if nums1[m-1] > nums2[n-1]:
                    nums1[index] = nums1[m-1]
                    m -= 1
                else:
                    nums1[index] = nums2[n-1]
                    n -= 1
                index -= 1
            if m==0 and n>0:
                while n>0:
                    nums1[index] = nums2[n-1]
                    n -= 1
                    index -= 1




if __name__ == '__main__':
    l: leetcode_88 = leetcode_88()
    l.solve()
