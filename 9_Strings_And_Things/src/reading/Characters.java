package reading;

public class Characters {

	public static void main(String[] args) {

		String name1 = "Quan Minh Truong Mint ";

		// String upperCaseName = name.toUpperCase();

		// System.out.println(upperCaseName);
		String s = "test string (67)";
		// searches for index of "(" and adds 1

		// begins at index of "(" + 1
		s = s.substring(s.indexOf("(") + 1);

		// ohhhhhh..... notice how s is now set to begin at the index of
		// character "(" +1
		// so now we begin at the first char after "(" and end at ")"
		s = s.substring(0, s.indexOf(")"));

		// System.out.println(s);

		String quanch = "Quanchimodo is learning how to use substring method for java";

		// begin at first sign of chi
		quanch = quanch.substring(quanch.indexOf("chi"));

		// end at end of next g
		quanch = quanch.substring(0, quanch.indexOf("g") + 1);

//		System.out.println(quanch);

		// search for index of M
		String name = "Quan Minh Truong Minh ";

		// p: traverse through an array with an enchanced for loop
	/*	for (int count = 1; count < name.length(); count++) {
			for (char i : name.toCharArray()) {
				System.out.print("letter[" + count + "]" + i + " ");
				count++;
			}
		}
*/
		// replace Minh with Mint
	/*	name = name.replace("Minh", "MinT");
		name = name.replace("Truong", "QuanchiModo");*/

		// System.out.println(name);

//		 begins at Q == 0.. can insert name.indexOf("Q") or 0 insidesubstring()
		 name = name.substring(0, name.indexOf("i"));
//		 ends at "T"
//		 name = name.substring(0, name.indexOf("T"));
		 System.out.println("searched name: " + name);

		// String traversal - go through every letter in name

		/*
		 * //starts at M name = name.substring(name.indexOf("Min")); //ends at
		 * " " after "M" name = name.substring(0, name.indexOf(" "));
		 * System.out.println(name);
		 */

		// System.out.println(s);

		// System.out.println(name);

		// char letter = name.charAt(0, 4);

		// System.out.println(letter);

	}

}
