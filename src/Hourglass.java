/*
- Declare Constant that will control width and height of hourglass -- dependant on height:
	-Width increases by 2 every increase in 2 height -- directly correlating
- Write Method for top and bottom of hourglass
	-Use class constant
- Nested for loops to create top and bottom (separate methods) midsections of the hourglass
	-Top section
		-Increase spaces per level of height
		-Decrease colons per level of height
	-Bottom section
		-Decrease spaces per level of height
		-Increase colons per level of height
- Loop in order to make sure center neck portion of hourglass is directly in the middle using spaces based on constant

-NOTES -- Used integer "counter" etc. to make numerical relation more obvious and easily changeable/understandable
*/

public class Hourglass {
	/************************************************************************/
	/*CLASS CONSTANT TO ADJUST HOURGLASS SIZE:                              */
	/*(Size determines the height of the triangular portion of the hourglass*/
	/*(Default Size  = 4) (Integer must be >0)                              */
	public static final int SIZE = 4;
	/************************************************************************/
	public static void main (String[] args) {
		bases();
		topHalf();
		centerNeck();
		bottomHalf();
		bases();
	}
	public static void bases () { //creates the top and bottom of the hourglass
		System.out.print("|");
		int counter = SIZE * 2 + 2; //the length of the quotation marks are always double of size plus 2
		for (int i = 1; i <= counter; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void centerNeck () { //creates the "neck" portion of the hourglass. 
		int counter = SIZE + 1; // spaces are always size of half hourglass plus 1
		for (int i = 1; i <= counter; i++) {
			System.out.print(" ");
		}
		System.out.println("||");
	}
	public static void topHalf () { //creates top half of hourglass body
		int counterC = SIZE * 2; //colon count is always size * 2 to start
		for (int i = 1; i <= SIZE; i++) { //creates layers of hourglass -- terminates when desired defined level reached
			for (int j = 1; j <= i; j++) { //adds spaces for each layer of hourglass -- spaces = layer # (i)
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int k = 1; k <= counterC; k++) {
				System.out.print(":"); //prints the colon 2 * the SIZE times
			}
			System.out.println("/");
			counterC -=2; //overwrite colon count to add another step
		}
	}
	public static void bottomHalf () { //creates bottom half of hourglass body
		int counterC = 2;
		int spaceCount = SIZE;
		for (int i = 1; i <= SIZE; i++) { //creates layers of hourglass -- terminates when desired defined level reached
			for (int j = spaceCount; j >= 1; j--) { //removes spaces for each layer of hourglass -- starting spaces = layer # (i)
				System.out.print(" ");
			}
			System.out.print("/");
			for (int k = 1; k <= counterC; k++) {
				System.out.print(":"); //prints the colon 2, then adding 2 until reaching desired level of size
			}
			System.out.println("\\");
			counterC+=2;
			spaceCount--;
		}
	}
}
