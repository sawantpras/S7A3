public class SubstringDemo2 {

	public static void main(String[] args) {
		// DECLARE TWO STRINGS
		// ONE IS ORIGINAL STRING
		// ANOTHER ONE IS SUBSTRING WHICH WE WANT TO CHECK
		String originalstr = "prashant";
		String subs = "prash";
		// CREATE TWO CHAR ARRAY TO STORE TWO STRINGS
		char[] originalstrArray = originalstr.toCharArray();
		char[] subsArray = subs.toCharArray();
		// HERE WE CALL ISPRESENT METHOD TO CHECK SUBSTRING PRESENT OR NOT
		if (isPresent(subsArray, originalstrArray)) {
			System.out.println("Substring is found");
		} else
			System.out.println("Substring is not found");

	}

	// BOOLEAN ISPRESENT METHOD TAKE TWO PARAMETER AS A ARRAY
	// CHECK CHARACTER BY CHARACTER WHETHER IT IS PRESENT OR NOT
	public static boolean isPresent(char[] subs, char[] originalstr) {
		for (int i = 0; i < originalstr.length - subs.length + 1; i++) {
			for (int j = 0; j < subs.length; j++) {
				if (originalstr[i + j] == subs[j]) {
					if (j == subs.length - 1) {
						return true;
					}
				} else {
					break;
				}
			}
		}
		return false;
	}
}