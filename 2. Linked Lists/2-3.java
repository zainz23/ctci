// Given a position in the LL
// Delete the given node
// Constraint: Cant be first or last node

// Approach: Take data from next node and place in current node and skip over it
// Runtime: O(1)
void deleteMid(Node n ) {
  // Case check for 0 or 1 element
  if (n == null || n.next == null) {
    return;
  }
  
  // Transfer data
  n.data = n.next.data; // Current gets replaced with next's data
  n.next = n.next.next; // Next's node gets replaced with nextnext
}
