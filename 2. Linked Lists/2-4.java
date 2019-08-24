public ListNode partition(ListNode head, int x) {
    ListNode before_hd = new ListNode(0);   // Save head
    ListNode before = before_hd;          // Create list
    ListNode after_hd = new ListNode(0);    // Save head
    ListNode after = after_hd;              // Create list

    // Traverse through given list
    while (head != null) {
        // goes in before list
        if (head.val < x) {
            before.next = head;     // add to before
            before = before.next;   // Traverse next of before list
        }
        // goes in after list
        else {
            after.next = head;  // add to after
            after = after.next; // Traverse next of after list
        }
        head = head.next;   // continue traversal
    }
    // Combine the before and after list
    // go ahead one node since we used a dummy node
    before.next = after_hd.next;    // (Before is already at end of list - so combine then)
    after.next = null;  // end of list

    return before_hd.next;  // One node ahead dummy;
}
