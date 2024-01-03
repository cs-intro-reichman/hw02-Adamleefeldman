/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		int Num1, Num2;

		Num1 = (int)(Math.random()*10);
			System.out.println(Num1);

		do { 
			Num2 = (int)(Math.random()*10);
			if (Num1<=Num2){
				System.out.println(Num2);
				Num1 = Num2;
			}
		
		} while(Num1 <= Num2);
			
	
	}
}
