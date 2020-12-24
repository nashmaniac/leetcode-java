from typing import *

class leetcode_811(object):
    """leetcode_811 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_811"""
        pass

    def solve(self):
        pass

    def subdomainVisits(self, cpdomains: List[str]) -> List[str]:
        update_dict = dict()

        for i in cpdomains:
            count, d = i.split(" ", maxsplit=1)
            domains = d.split(".")
            for i in range(len(domains)-1, -1, -1):
                domain = '.'.join(domains[i:])
                if domain in update_dict:
                    update_dict.update({
                        domain: int(count) + update_dict[domain]
                    })
                else:
                    update_dict.update({
                        domain: int(count)
                    })
        return ["%d %s"%(update_dict[k], k) for k in update_dict]



if __name__ == '__main__':
    l:leetcode_811 = leetcode_811()
    l.solve()

