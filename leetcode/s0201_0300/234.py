from typing import *


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class leetcode_234(object):
    """leetcode_234 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_234"""
        pass

    def solve(self):
        for i in [[1, 2], [1, 2, 2, 1], [1, 2, 3, 2, 1]]:
            head: ListNode = None
            current: ListNode = None
            for j in i:
                if current is None:
                    head = ListNode(j)
                    current = head
                else:
                    current.next = ListNode(j)
                    current = current.next

            print(self.isPalindrome(head))

    def revList(self, head: ListNode) -> ListNode:
        prev = None
        current = head
        while current is not None:
            next = current.next
            current.next = prev
            prev = current
            current = next
        return prev

    def printChain(self, head: ListNode):
        c = []
        while head is not None:
            c.append(head.val)
            head = head.next

        print(c)

    def isPalindrome(self, head: ListNode) -> bool:
        # find length
        current = head
        l = 0
        while current is not None:
            l += 1
            current = current.next

        current = head
        m = l // 2
        while m > 1:
            current = current.next
            m -= 1

        rev = self.revList(current.next)
        # self.printChain(rev)

        current = head
        m = l // 2
        if l%2 == 1:
            while m > 0:
                current = current.next
                m -= 1
        else:
            while m > 1:
                current = current.next
                m -= 1
        current.next = None
        # self.printChain(head)

        while rev is not None and head is not None:
            if rev.val != head.val:
                return False
            head = head.next
            rev = rev.next

        return True


if __name__ == '__main__':
    l: leetcode_234 = leetcode_234()
    l.solve()
