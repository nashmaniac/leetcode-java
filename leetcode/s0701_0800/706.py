from typing import *


class MyHashMap:

    hash_key = 1000001
    data: int = []

    def __init__(self):
        """
        Initialize your data structure here.
        """
        for i in range(0, self.hash_key):
            self.data.append(-1)

    def put(self, key: int, value: int) -> None:
        """
        value will always be non-negative.
        """
        self.data[key%self.hash_key] = value


    def get(self, key: int) -> int:
        """
        Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
        """
        return self.data[key%self.hash_key]

    def remove(self, key: int) -> None:
        """
        Removes the mapping of the specified value key if this map contains a mapping for the key
        """
        self.data[key % self.hash_key] = -1


class leetcode_706(object):
    """leetcode_706 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_706"""
        pass

    def solve(self):
        pass


if __name__ == '__main__':
    l: leetcode_706 = leetcode_706()
    l.solve()
