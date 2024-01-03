/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String sOut = "";
		
		for(int i=1; i<=n; i++){
			sOut = "";

			for(int j=1; j<=n; j++){

				if (i%2!=0){
					sOut =  sOut + "* ";
				} else {
					sOut = sOut + " *";
				}
			}

			System.out.println(sOut);

			
			

			
					
			
		}

	}
}
