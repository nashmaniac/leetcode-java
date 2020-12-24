from typing import *

class leetcode_412(object):
    """leetcode_412 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_412"""
        pass
        
    def solve(self):
        pass

    def fizzBuzz(self, n: int) -> List[str]:
        a = []
        for i in range(1, n+1):
            if i%15 == 0:
                a.append("FizzBuzz")
            elif i%3 == 0:
                a.append("Fizz")
            elif i%5 == 0:
                a.append("Buzz")
            else:
                a.append(str(i))

        return a

        
if __name__ == '__main__':
    l:leetcode_412 = leetcode_412()
    l.solve()

