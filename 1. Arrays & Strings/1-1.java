/* #1.1 */
public boolean isUnique(String str) {
	if(str.length() > 128) return false;
	boolean[] char_set = new boolean[128];

	// Loop and check for flags we set
	for (int i= 0; i < str.length(); i++) {
		// chars are converted to "unique" numbers
		int flag_index = str.charAt(i);
		// We find the char (it's already been used)
		if (char_set[flag_index]) {
			return false;
		}
		// Mark it used
		char_set[flag_index] = true;
	}
	return true;
}
