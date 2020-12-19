from typing import *


class leetcode_746(object):
    """leetcode_746 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_746"""
        pass

    def solve(self):
        pass

    def minCostClimbingStairs(self, cost: List[int]) -> int:
        a = [cost[0], cost[1]]
        for i in range(2, len(cost)):
            a.append(min([a[i-1]+cost[i], a[i-2]+cost[i]]))
        return min([a[len(a)-1], a[len(a)-2]])


if __name__ == '__main__':
    l: leetcode_746 = leetcode_746()
    l.solve()
