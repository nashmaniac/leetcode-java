class leetcode_345(object):
    """leetcode_345 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_345"""
        pass

    def solve(self):
        print(self.reverseVowels("leetcode"))
        print(self.reverseVowels("hello"))
        print(self.reverseVowels("hbllo"))

    def reverseVowels(self, s: str) -> str:
        m = len(s) - 1
        n = 0
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        s = list(s)
        while n < m:
            while n < m:
                if s[n] not in vowels:
                    n += 1
                else:
                    break
            while m > n:
                if s[m] not in vowels:
                    m -= 1
                else:
                    break
            temp = s[n]
            s[n] = s[m]
            s[m] = temp
            n += 1
            m -= 1

        return ''.join(s)


if __name__ == '__main__':
    l: leetcode_345 = leetcode_345()
    l.solve()
