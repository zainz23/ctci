/* 1-5 */
// Input: 2 strings
// Output: boolean
// Constraint: optimize
// Edge case: Empty str, etc.
// *Examples*
// pale, ple -> true
// pales, pale -> true
// pale, bale -> true
// pale, bake -> false
boolean oneAway(String str1, String str2) {
	// If they're equal length, must be replaceable
	if (str1.length() == str2.length() ) {
		return checkReplace(str1, str2);
	}
	// A character was removed
	// pale, ple
	else if (str1.length() - 1 == str2.length() ) {
		return checkEdit(str1, str2);
	}
	// Character added (inverse of remove)
	// joe, joes
	else if (str1.length() + 1 == str2.length() ) {
		return checkEdit(str2, str1);
	}
	else {
		return false;
	}

}

boolean checkReplace(String str1, String str2) {
	boolean diff_flag = false;	// Only one difference allowed
	for (int i = 0; i < str1.length(); i++) {
		if (str1.charAt(i) != str2.charAt(i) ) {
			if (diff_flag) {	// Already changed flag
				return false;
			}
			diff_flag = true;
		}
	}
	return true;
}
boolean checkEdit(String str1, String str2) {
	int index1 = 0;
	int index2 = 0;
	while (index1 < str1.length() && index2 < str2.length()) {
		if (str1.charAt(index1) != str2.charAt(index2) ) {
			if (index1 != index2) {
				return false;
			}
			index1++;
		}
		index1++;
		index2++;
	}
}
