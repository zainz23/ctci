public boolean isPalindrome(ListNode head) {
    Stack<ListNode> s = new Stack<ListNode>();
    ListNode p = head;

    for (ListNode i = head; i != null; i = i.next) {
        s.push(i);
    }

    while (p != null) {
        if (p.val != (s.pop()).val ) {
            return false;
        }
        p = p.next;
    }
    return true;
}
