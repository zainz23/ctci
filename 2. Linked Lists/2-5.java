public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);  // Dummy node for result list
    ListNode p = l1, q = l2, r = result;
    int carry = 0;

    while (p != null || q != null) {
        int x = (p != null ) ? p.val : 0;
        int y = (q != null ) ? q.val : 0;

        int sum = x + y + carry;
        carry = sum / 10;   // Essentially obtains the carry (0 or 1)

        r.next = new ListNode(sum % 10);    // Modulus to get result of sum (or remainder)
        // move r to next node
        r = r.next;

        // Traverse through both lists
        if (p != null ) p = p.next;
        if (q != null ) q = q.next;
    }
    // The case where there's a remainder for both null
    if (carry > 0 ) {
        r.next = new ListNode(carry);
    }

    return result.next; // One ahead of dummy node
}
