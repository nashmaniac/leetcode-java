from typing import *


class leetcode_66(object):
    """leetcode_66 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_66"""
        pass

    def solve(self):
        pass

    def plusOne(self, digits: List[int]) -> List[int]:
        carry = 1
        for i in range(len(digits) - 1, -1, -1):
            temp = digits[i] + carry
            digits[i] = temp
            if digits[i] >= 10:
                digits[i] = temp % 10
                carry = temp // 10
            else:
                carry = 0
                break
        if carry > 0:
            digits.insert(0, carry)
        return digits


if __name__ == '__main__':
    l: leetcode_66 = leetcode_66()
    l.solve()
