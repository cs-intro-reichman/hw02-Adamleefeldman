/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String sIn = args[0];
		String sOut = "";
		for (int i = sIn.length() - 1; i>=0; i--) {
			char c = sIn.charAt(i);
			sOut += c;
		}
		System.out.println(sOut);

		int midIndex = sIn.length()/2;
		char midCharacter = sIn.charAt(midIndex);

		System.out.println("The middle character is " + midCharacter);


	}
}
