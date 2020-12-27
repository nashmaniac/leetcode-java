class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class leetcode_141(object):
    """leetcode_141 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_141"""
        pass

    def solve(self):
        pass

    def hasCycle(self, head: ListNode) -> bool:
        if head is None:
            return False
        if head.next is None:
            return False

        slow: ListNode = head
        fast: ListNode = head.next

        while slow != fast:
            if fast.next is None or fast.next.next is None:
                return False

            slow = slow.next
            fast = fast.next.next

        return True


if __name__ == '__main__':
    l: leetcode_141 = leetcode_141()
    l.solve()
