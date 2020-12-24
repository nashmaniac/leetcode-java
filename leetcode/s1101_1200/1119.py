class leetcode_1119(object):
    """leetcode_1119 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_1119"""
        pass
        
    def solve(self):
        pass

    def removeVowels(self, s: str) -> str:
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        a = ''
        for i in s:
            if i not in vowels:
                a += i
        return a
        
if __name__ == '__main__':
    l:leetcode_1119 = leetcode_1119()
    l.solve()

