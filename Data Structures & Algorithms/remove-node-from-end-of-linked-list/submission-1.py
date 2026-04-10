# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        N=0
        curr=head
        while curr is not None:
            N+=1
            curr=curr.next
        ind=N-n
        if ind==0:
            return head.next
        curr=head
        for i in range(0,N-1):
            if i+1==ind:
                curr.next=curr.next.next
                break
            curr=curr.next
        return head
        