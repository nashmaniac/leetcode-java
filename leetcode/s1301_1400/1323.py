from typing import *


class leetcode_1323(object):
    """leetcode_1323 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_1323"""
        pass

    def solve(self):
        pass

    def maximum69Number(self, num: int) -> int:
        num = list(str(num))
        for id, i in enumerate(num):
            if i == '6':
                num[id] = '9'
                break
        return int(''.join(num))






if __name__ == '__main__':
    l: leetcode_1323 = leetcode_1323()
    l.solve()
