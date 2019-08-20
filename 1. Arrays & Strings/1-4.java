/* 1-4 */
boolean isPermOfPalindrome(String str) {
	// Create int table of how often a char appears
	int[] table = buildFrequency(str);
	// Maximum of one odd number
	return checkOdd(table);
}

int[] buildFrequency(String str) {
	int[] freqTable = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
	for (char c : str.toCharArray() ) {
		int x = Character.getNumericValue(c);
		if (x != -1) {
			freqTable[x]++;
		}
	}
	return freqTable;
}

boolean checkOdd(int [] table) {
	// Maximum of one odd # allowed
	boolean odd_flag = false;
	for (int count : table) {
		if (count % 2 == 1) {
			if (odd_flag) {
				return false;
			}
			odd_flag = true;
		}
	}
	return true;
}
