from typing import *
class leetcode_1(object):
    """leetcode_1 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_1"""
        pass

    def solve(self):
        print(self.twoSum([2, 7, 11, 15], 9))

    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_dict = dict()

        for id, num in enumerate(nums):
            if str(target - num) not in num_dict:
                num_dict.update(**{
                    str(num): id
                })
            else:
                return [num_dict[str(target-num)], id]

        return [-1, -1]


if __name__ == '__main__':
    l: leetcode_1 = leetcode_1()
    l.solve()
