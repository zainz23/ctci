/* 1-6 */

String strCompress (String str) {
	int count = 0;
	char currChar = str.charAt(0);
	StringBuilder sb = new StringBuilder(str);
	for (char c : str.toCharArray() ){
		if (c == currChar) {
			count++;
			continue;
		}
		else {
			// Add char to sb before going to next unique char
			sb.append(currChar);
			// Add count to sb
			sb.append(count);
			count = 0;	// reset counter
			currChar = c;	// new char to keep track of
		}
	}
	// If it's shorter than original string, return it
	if (sb.length() < str.length() ) {
		return sb.toString();
	}
	else {
		return str;
	}
}
