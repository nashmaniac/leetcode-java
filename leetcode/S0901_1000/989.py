from typing import *
import math

class leetcode_989(object):
    """leetcode_989 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_989"""
        pass

    def solve(self):
        A = [1, 2, 0, 0]
        K = 34
        A = [2, 7, 4]
        K = 181
        self.addToArrayForm(A, K)

    def addToArrayForm(self, A: List[int], K: int) -> List[int]:
        m = len(A)
        result = 0
        for id, i in enumerate(A):
            result += int((math.pow(10, (m - 1 - id)) * i))
        result = int(result + K)
        if result == 0:
            return [result]
        a = []
        while result > 0:
            a.insert(0, int(result % 10))
            result = result // 10

        return a






if __name__ == '__main__':
    l: leetcode_989 = leetcode_989()
    l.solve()
