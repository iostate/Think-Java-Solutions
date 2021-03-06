package StringTraversal;

public class subString {

	public static void main(String[] args) {
		String name = "Quan Minh Truong Minh ";

		// p: Extract from Q to T from String name

		// begins at Q == 0.. can insert name.indexOf("Q") or 0
		// insidesubstring()
		name = name.substring(0);

		// ends at "T"
		name = name.substring(0, name.indexOf("T") + 1);

		// print the result
		System.out.println("searched name: " + name);

		String name1 = "Hello world";

		// Searches for an 0 past the 5th index
		System.out.print("The first \"o\" after the 5th index is found at: ");
//		findIndexOf(name1, 'o', 5);

		StringTraversal.extract4rmString(name1, "H", ("d"));

	}

	/**
	 * Find the index of a number after an index. Does same thing as
	 * n.indexOf('a', 2), which finds the first char 'a' after the 2nd index.
	 * 
	 * @param n
	 *            The string to be searched
	 * @param char2Find
	 *            The char literal to find
	 * @param afterThisIndex
	 *            The index to search after.
	 * @return
	 */
	public static int findIndexOf(String n, char char2Find, int afterThisIndex) {
		int index = n.indexOf(char2Find, afterThisIndex);

		System.out.println(index);
		return index;
	}

}
