from typing import *


class leetcode_20(object):
    """leetcode_20 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_20"""
        pass

    def solve(self):
        pass

    def isValid(self, s: str) -> bool:
        opening = ['(', '{', '[']
        stack = []
        for i in s:
            if i in opening:
                stack.append(i)
            else:
                if len(stack) == 0:
                    return False
                if i == '(' and stack[-1]!=')':
                    return False
                if i == '{' and stack[-1]!='}':
                    return False
                if i == '[' and stack[-1]!=']':
                    return False
                stack.pop()
        return len(stack) == 0



if __name__ == '__main__':
    l: leetcode_20 = leetcode_20()
    l.solve()
