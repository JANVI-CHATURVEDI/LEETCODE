# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        slow = head
        fast = head

        while fast and fast.next :
            slow = slow.next
            fast = fast.next.next

        prev = None
        curr = slow

        while curr:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt

        start = head

        while prev:
            if start.val != prev.val:
                return False

            prev = prev.next
            start = start.next


        return True             
        