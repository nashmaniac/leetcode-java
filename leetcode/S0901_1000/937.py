from typing import *


class leetcode_937(object):
    """leetcode_937 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_937"""
        pass

    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        def get_key(obj: str):
            _id, rest = obj.split(" ", maxsplit=1)
            return (0, rest, _id) if rest[0].isalpha() else (1,)

        return sorted(logs, key=get_key)

    def solve(self):
        logs = ["dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"]
        self.reorderLogFiles(logs)


if __name__ == '__main__':
    l: leetcode_937 = leetcode_937()
    l.solve()
