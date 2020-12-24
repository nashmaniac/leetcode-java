from typing import *

class leetcode_387(object):
    """leetcode_387 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_387"""
        pass
        
    def solve(self):
        pass

    def firstUniqChar(self, s: str) -> int:
        letter_dict = dict()
        for i in s:
            if i not in letter_dict:
                letter_dict.update({
                    i: letter_dict[i] + 1
                })
            else:
                letter_dict.update({
                    i: 1
                })
        for id, i in enumerate(list(s)):
            if letter_dict[i] == 1:
                return id
        return -1
        
if __name__ == '__main__':
    l:leetcode_387 = leetcode_387()
    l.solve()

