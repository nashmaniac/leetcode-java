from typing import *


class Element:
    val: int
    min: int

    def __init__(self, val: int, min: int):
        self.val = val
        self.min = min


class MinStack:
    data: List[Element] = []

    def is_empty(self) -> bool:
        return len(self.data) == 0

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.data = []

    def push(self, x: int) -> None:
        if self.is_empty():
            self.data.append(Element(x, x))
        else:
            self.data.append(Element(x, min(x, self.getMin())))

    def pop(self) -> None:
        self.data.pop()

    def top(self) -> int:
        return self.data[-1].val

    def getMin(self) -> int:
        return self.data[-1].min


class leetcode_155(object):
    """leetcode_155 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_155"""
        pass

    def solve(self):
        pass


if __name__ == '__main__':
    l: leetcode_155 = leetcode_155()
    l.solve()
