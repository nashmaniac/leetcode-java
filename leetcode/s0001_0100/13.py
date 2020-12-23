from typing import *
class leetcode_13(object):
    """leetcode_13 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_13"""
        pass

    def solve(self):
        s = ['III', 'IV', 'LVIII', 'MCMXCIV']
        for i in s:
            print(i, self.romanToInt(i))

    def romanToInt(self, s: str) -> int:
        letters: List[str] = ['M', 'D', 'C', 'L', 'X', 'V', 'I'];
        values: List[int] = [1000, 500, 100, 50, 10, 5, 1]
        values_dict = dict()
        for i in zip(letters, values):
            values_dict.update(**{
                i[0]: i[1]
            })
        lastCharacter = s[len(s)-1]
        total = values_dict[lastCharacter]
        for i in range(len(s)-2, -1, -1):
            if values_dict[s[i]]<values_dict[lastCharacter]:
                total -= values_dict[s[i]]
            else:
                total += values_dict[s[i]]
            lastCharacter = s[i]

        return total


if __name__ == '__main__':
    l: leetcode_13 = leetcode_13()
    l.solve()
