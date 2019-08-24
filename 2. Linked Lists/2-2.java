int kthLast(Node hd, int k) {
  // Base case
  if (hd == null) {
    return 0;
  }
  // Keep track of a counter
  int counter = kthLast(hd.next, k) + 1;  // Going 1 one away from end
  
  if (counter == k) {
    return hd.data;
  }
  return counter;
}
