from typing import *


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class leetcode_206(object):
    """leetcode_206 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_206"""
        pass

    def solve(self):
        pass

    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        current = head
        while current is not None:
            next = current.next
            current.next = prev
            prev = current
            current = next
        return prev



if __name__ == '__main__':
    l: leetcode_206 = leetcode_206()
    l.solve()
