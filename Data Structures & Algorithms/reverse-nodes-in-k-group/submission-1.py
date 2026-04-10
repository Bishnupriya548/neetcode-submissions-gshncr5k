# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        curr=head
        gr=0
        while curr and gr<k:
            curr=curr.next
            gr+=1
        if gr==k:
            curr=self.reverseKGroup(curr,k)
            while gr>0:
                temp=head.next
                head.next=curr
                curr=head
                head=temp
                gr-=1
            head=curr
        return head
        