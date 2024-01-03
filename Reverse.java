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

		int midIndex;
		char midCharacter;
//checks if length of string is odd or even to determine where middle char is 
		if (sIn.length()%2==0){
			midIndex = (sIn.length()/2) - 1;
		} else { 
			midIndex = sIn.length()/2;
		}

		midCharacter = sIn.charAt(midIndex);
		System.out.println("The middle character is " + midCharacter);


	}
}
