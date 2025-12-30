class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fast=head;
        while(fast!=null && fast.next!=null) {
            if(fast.val==fast.next.val) {
                fast.next=fast.next.next;
                continue;
            }
            fast=fast.next;
        }
        return head;
    }
}
