/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int Num = Integer.parseInt(args[0]);
		int i = 1;
		String sOut = Num + " is a perfect number since " + Num + " = ";

		int sum = 0;
		boolean hasDivisors = false;

		while(i < Num) {
			if (Num%i == 0) {
				if (hasDivisors){
					sOut += " + ";
				}
				sOut += i ;
				sum += i;
				hasDivisors = true;
			}	
			i += 1;
		} 

		if (sum==Num){
			System.out.println(sOut);
		} else {
			System.out.println(Num + " is not a perfect number");

			
	}
}

}
