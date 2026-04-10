/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)return head;
         ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevGr=dummy;
        ListNode curr=head;
        
        while(true){
            ListNode node=curr;
            int cnt=0;
            while(cnt<k && node!=null ){
                node=node.next;
                cnt++;
            }
            if(cnt<k)break;
            ListNode prev=null,temp=curr;
            for(int i=0;i<k;i++){
                ListNode nxt=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nxt;
            }
            prevGr.next=prev;
            temp.next=curr;
            prevGr=temp;


        }
        return dummy.next;
    }
}
