// Solution 1
/*
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
*/

// Solution 2 (preferred) - Compare 1st half w/ 2nd half of list
public boolean isPalindrome(ListNode head) {
    // Solution 2
    ListNode slow = head;   // Iterates at default speed
    ListNode fast = head;   // Iterates 2x as fast

    Stack<ListNode> s = new Stack<ListNode>();  // Stack for 1st half

    while (fast != null && fast.next != null) {
        s.push(slow);           // Push to first half stack
        slow = slow.next;       // 1x
        fast = fast.next.next;  // 2x
    }

    // When fast is == null, we know were at middle for slow
    // Odd number, so we go further
    if (fast != null) {
        slow = slow.next;   // skip that 1 middle element (ie. "131" 3 is not needed)
    }

    // Compare starting from slow's mid position to stack
    while (slow != null) {
        if (slow.val != (s.pop()).val) {
            return false;
        }
        slow = slow.next;   // traverse further in 2nd half
    }
    return true;
}
