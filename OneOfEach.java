
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean Boy = false;
		boolean Girl = false;
		int counter = 0;

		while(!(Boy && Girl)){
			boolean isBoy = Math.random() < 0.5;

			if (isBoy){
				Boy = true;
			}else { 
				Girl = true;
			}
			counter++;

			System.out.print(isBoy ? "b" : "g");

			}
		System.out.println();
		System.out.println("You made it... and you now have " + counter + " children.");
		}
	}

