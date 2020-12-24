from typing import *


class leetcode_415(object):
    """leetcode_415 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_415"""
        pass

    def solve(self):
        for i in ([["11", "9"], ["11", "143"], ["9", "1"]]):
            print(i, self.addStrings(i[0], i[1]))

    def addStrings(self, num1: str, num2: str) -> str:
        if len(num1) > len(num2):
            return self.addStrings(num2, num1)
        m = len(num1)
        n = len(num2)
        carry = 0
        result = []
        for i in range(0, m):
            result.append(str((int(num1[m-1-i]) + int(num2[n-1-i]) + carry) % 10))
            carry = (int(num1[m-1-i]) + int(num2[n-1-i]) + carry) // 10

        for i in range(n-m-1, -1, -1):
            result.append(str((int(num2[i]) + carry) % 10))
            carry = (int(num2[i]) + carry) // 10

        if carry > 0:
            result.append(str(carry))

        return ''.join(reversed(result))



if __name__ == '__main__':
    l: leetcode_415 = leetcode_415()
    l.solve()
