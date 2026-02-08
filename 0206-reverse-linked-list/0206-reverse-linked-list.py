# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        if head is None or head.next is None:
            return head

        nextnode = head.next
        node = head
        prevnode = None

        while node is not None :
            node.next = prevnode
            prevnode = node
            node = nextnode
            if node is not None:
                nextnode = node.next



        return prevnode