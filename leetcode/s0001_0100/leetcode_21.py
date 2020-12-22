from typing import *


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class leetcode_21(object):
    """leetcode_21 documentation"""

    def __init__(self, *args, **kwargs):
        """Constructor for leetcode_21"""
        pass

    def make_chain(self, a):
        a_node = None
        current_node = None
        for index, i in enumerate(a):
            if index == 0:
                a_node = ListNode(i)
                current_node = a_node
            else:
                a_node.next = ListNode(i)
                a_node = a_node.next
        return current_node


    def solve(self):
        a = []
        b = [0]

        a_node = self.make_chain(a)
        b_node = self.make_chain(b)

        self.mergeTwoLists(a_node, b_node)



    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        newNode: ListNode = None
        currNode: ListNode = None
        if l1 is not None and l2 is None:
            return l1
        if l1 is None and l2 is not None:
            return l2


        while l1 is not None and l2 is not None:
            if l1.val <= l2.val:
                if newNode is None:
                    newNode = l1
                    currNode = newNode
                else:
                    newNode.next = l1
                    newNode = newNode.next
                l1 = l1.next
            else:
                if newNode is None:
                    newNode = l2
                    currNode = newNode
                else:
                    newNode.next = l2
                    newNode = newNode.next
                l2 = l2.next
        if l1 is not None:
            newNode.next = l1

        if l2 is not None:
            newNode.next = l2

        return currNode


if __name__ == '__main__':
    l: leetcode_21 = leetcode_21()
    l.solve()
