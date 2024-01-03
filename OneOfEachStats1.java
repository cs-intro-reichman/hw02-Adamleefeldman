/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
	//initialize variables that will be used 
				int T = Integer.parseInt(args[0]);
				int TwoChildren = 0;
				int ThreeChildren = 0;
				int FourOrMore= 0;
				int TotalChildren = 0;
	//for loop which runs T simulations 
				for(int i = 0; i<T; i++){
					boolean Boy = false;
					boolean Girl = false;
					int counter = 0;
	//while loop as used previously to check the gender under the assumed probability and add to count
					while(!(Boy && Girl)) {
						double rnd = Math.random();
						boolean isBoy = rnd < 0.5;
		
						if (isBoy){
						Boy = true;
						}else { 
							Girl = true;
						}
						counter++;
		
						}
					TotalChildren += counter;
//checking to see how many children 
					if (counter==2){
						TwoChildren++;
					} else if (counter==3){
						ThreeChildren++;
					} else{
						FourOrMore++;
					}

				}
//final calculations and outputs 
				double AverageChildren = (double) TotalChildren/T;
				System.out.println("Average: " + AverageChildren + " children to get at least one of each gender.");
				System.out.println("Number of families with 2 children: " + TwoChildren);
				System.out.println("Number of families with 3 children: " + ThreeChildren);
				System.out.println("Number of families with 4 or more children: " + FourOrMore);
//comparing number of children to determine mode 
				if(TwoChildren > ThreeChildren && TwoChildren > FourOrMore){
					System.out.println("The most common number of children is 2.");
				} else if (ThreeChildren > TwoChildren && ThreeChildren > FourOrMore){
					System.out.println("The most common number of children is 3.");
				} else{
					System.out.println("The most common number of children is 4 or more.");
				}			
			}
			
		}
	

