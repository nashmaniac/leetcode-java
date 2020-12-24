from typing import *


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class leetcode_203(object):
    """leetcode_203 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_203"""
        pass

    def solve(self):
        a = [1, 2, 6, 3, 4, 5, 6]
        val = 6
        dummy = ListNode(-1)
        head = dummy
        for i in a:
            dummy.next = ListNode(i)
            dummy = dummy.next
        self.removeElements(head.next, val)

    def print(self, head: ListNode):
        a = []
        while head is not None:
            a.append(head.val)
            head = head.next

        print(a)
    def removeElements(self, head: ListNode, val: int) -> ListNode:
        dummy: ListNode = ListNode(-1)
        dummy.next = head
        prev: ListNode = dummy
        current: ListNode = head

        while current is not None:
            if current.val == val:
                prev.next = current.next
                prev = current.next
                current = current.next
            else:
                prev = current
                current = current.next
        # self.print(dummy.next)
        return dummy.next


if __name__ == '__main__':
    l: leetcode_203 = leetcode_203()
    l.solve()
