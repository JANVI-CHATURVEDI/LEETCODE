class Solution(object):
    def removeNthFromEnd(self, head, n):
        dummy = ListNode(0)
        dummy.next = head

        slow = dummy
        fast = dummy

        for _ in range(n):
            fast = fast.next

        while fast.next is not None:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next
        return dummy.next




        