from typing import *

class leetcode_125(object):
    """leetcode_125 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_125"""
        pass
        
    def solve(self):
        self.isPalindrome("A man, a plan, a canal: Panama")

    def isPalindrome(self, s: str) -> bool:
        punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~ '''
        no = ''
        for i in s:
            if i not in punctuations:
                no += i
        no = no.lower()
        m = len(no)-1
        n = 0
        while n<m:
            if no[n] != no[m]:
                return False
            n += 1
            m -= 1
        return True

        
if __name__ == '__main__':
    l:leetcode_125 = leetcode_125()
    l.solve()

