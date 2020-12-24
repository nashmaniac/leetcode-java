from typing import *


class leetcode_953(object):
    """leetcode_953 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_953"""
        pass

    def solve(self):
        words = ["hello", "leetcode"]
        order = "hlabcdefgijkmnopqrstuvwxyz"
        self.isAlienSorted(words, order)

    def sort_word(self, word1: str, word2: str, order_list: List[int]) -> bool:
        for i in zip(word1, word2):
            m, n = i
            if m != n:
                if order_list[ord(m) - ord('a')] > order_list[ord(n) - ord('a')]:
                    return False
                else:
                    return True

        if len(word1) > len(word2):
            return False

        return True

    def isAlienSorted(self, words: List[str], order: str) -> bool:
        order_list = [0 for i in range(len(order))]
        for id, i in enumerate(list(order)):
            order_list[ord(i) - ord('a')] = id

        for i in range(1, len(words)):
            word1 = words[i - 1]
            word2 = words[i]
            status = self.sort_word(word1, word2, order_list)
            if not status:
                return False
        return True


if __name__ == '__main__':
    l: leetcode_953 = leetcode_953()
    l.solve()
