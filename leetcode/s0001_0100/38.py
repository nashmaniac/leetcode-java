class leetcode_38(object):
    """leetcode_38 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_38"""
        pass

    def solve(self):
        for i in range(1, 10):
            print(self.countAndSay(i))

    def countAndSay(self, n: int) -> str:
        if n == 1:
            return "1"

        s: str = self.countAndSay(n-1)
        count = 1
        last = s[0]
        m = ''
        for i in s[1:]:
            if i == last:
                count += 1
            else:
                m += ('{}{}'.format(count, last))
                count = 1
            last = i
        m += ('{}{}'.format(count, last))
        return m


if __name__ == '__main__':
    l: leetcode_38 = leetcode_38()
    l.solve()
