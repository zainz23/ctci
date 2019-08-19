public void url(char[] str, int trueLength) {
    String str = "Mr John Smith    ";	// Change as necessary
    char[] arr = str.toCharArray();
    int trueLength = 13;
    // Count spaces
    int numSpaces = 0;
    for (int i = 0; i < trueLength; i++) {
      if (arr[i] == ' ') {
        numSpaces++;
      }
    }
    if (trueLength < arr.length) {
      arr[trueLength] = '\0'; // End of array
    }
    // Index of what were building backwards
    int index = trueLength + (2 * numSpaces) - 1;
    // Work backwards
    for (int i = trueLength - 1; i >= 0; i-- ) {
      if (arr[i] == ' ') {
        // Set indices of back to %20 (backwards)
        arr[index] = '0';
        arr[index - 1] = '2';
        arr[index - 2] = '%';
        // Our index is used, lets subtract that coverage
        index = index - 3;
      } 
      // Character thats non space
      else {
        arr[index] = arr[i];
        index = index - 1;
      }
    }
    System.out.println(arr);
}
