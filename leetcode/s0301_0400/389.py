from typing import *


class leetcode_389(object):
    """leetcode_389 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_389"""
        pass

    def solve(self):
        pass

    def findTheDifference(self, s: str, t: str) -> str:
        input_arr = [0 for i in range(26)]
        output = [0 for i in range(26)]
        for i in s:
            input_arr[ord(i) - ord('a')] += 1
        for i in t:
            output[ord(i) - ord('a')] += 1

        for id, i in enumerate(zip(input_arr, output)):
            if i[0] != i[1]:
                return chr(97 + id)

        return -1



if __name__ == '__main__':
    l: leetcode_389 = leetcode_389()
    l.solve()
