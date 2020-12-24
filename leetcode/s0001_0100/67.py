from typing import *


class leetcode_67(object):
    """leetcode_67 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_67"""
        pass

    def addBinary(self, a: str, b: str) -> str:
        if len(a) > len(b):
            return self.addBinary(b, a)

        m = len(a)
        n = len(b)
        s = []
        carry = 0
        for i in range(m):
            s.append((carry + int(a[m - 1 - i]) + int(b[n - 1 - i])) % 2)
            carry = (carry + int(a[m - 1 - i]) + int(b[n - 1 - i])) // 2

        for i in range(n - m - 1, -1, -1):
            s.append((int(b[i]) + carry) % 2)
            carry = (int(b[i]) + carry) // 2

        if carry > 0:
            s.append(carry)

        s = [str(x) for x in s]
        return ''.join(list(reversed(s)))


    def solve(self):
        print(self.addBinary("11", "1"))


if __name__ == '__main__':
    l: leetcode_67 = leetcode_67()
    l.solve()
