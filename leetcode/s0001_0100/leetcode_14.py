from typing import *


class leetcode_14(object):
    """leetcode_14 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_14"""
        pass

    def solve(self):
        print(self.longestCommonPrefix(["flower","flow","flight"]))

    def longestCommonPrefix(self, strs: List[str]) -> str:
        pref = ""
        if len(strs) == 0:
            return pref
        word = strs[0]
        for i in word:
            temp = pref+i
            for j in strs[1:]:
                if j[:len(temp)] != temp:
                    return pref
            pref += i
        return pref


if __name__ == '__main__':
    l: leetcode_14 = leetcode_14()
    l.solve()
