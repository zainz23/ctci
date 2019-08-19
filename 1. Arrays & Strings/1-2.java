/* #1.2 */
public boolean checkPerm(String str1, String str2) {
	// Check lengths
	// Perms cannot be of different lengths
	if (str1.length != str2.length) {
		return false;
	}
	// Sort and Compare
	// In java, we must do 3 things to sort a string
	//		1) Convert to charArray
	//		2) Sort using java.util.Arrays
	//		3) Use string constructor
	// 1)
	char[] c1 = str1.toCharArray();
	char[] c2 = str2.toCharArray();
	java.util.Arrays.sort(c1);
	java.util.Arrays.sort(c2);
	String s1 = new String(c1);
	String s2 = new String(c2);
  // Return comparison result
	return s1.equals(s2);
}
