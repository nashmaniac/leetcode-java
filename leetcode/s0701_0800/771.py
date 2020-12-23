from typing import *


class leetcode_771(object):
    """leetcode_771 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_771"""
        pass

    def solve(self):
        pass

    def numJewelsInStones(self, J: str, S: str) -> int:
        count = 0
        for c in S:
            if c in J:
                count += 1
        return count


if __name__ == '__main__':
    l: leetcode_771 = leetcode_771()
    l.solve()
