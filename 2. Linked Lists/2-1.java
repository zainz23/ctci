public void deleteDupes(Node hd ) {
  // Create a hashmap to keep track of occurences
  HashMap<Integer> hm = new HashMap<Integer>();
  Node previous = null; // Keep track of previous node so we can delete the next one in front
  while (hd != null) {
    // Check if it exists already
    if (hm.containsKey(hd.data) ) {
      // Use the previous node and current node to 'skip/delete'
      previous.next = hd.next;  // Current "hd" Node is deleted
    }
    else {
      // First time occurence, add to HM
      hm.put(hd.data);
      previous = hd;   // Move pointer to current location
    }
    hd = hd.next;
  }
