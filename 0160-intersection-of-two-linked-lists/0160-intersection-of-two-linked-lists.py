# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        if not headA or not headB:
            return None
        
        a = headA
        b = headB
        
        while a != b:
            a = a.next if a else headB
            b = b.next if b else headA
        
        return a
