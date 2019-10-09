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

-NOTES -- Used integer "counter" to make numerical relation more obvious and easily changeable
*/

public class Hourglass {
	/************************************************************************/
	/*CLASS CONSTANT TO ADJUST HOURGLASS SIZE:                              */
	/*(Size determines the height of the triangular portion of the hourglass*/
	/*(Default Size  = 4)                                                   */
	public static final int SIZE = 4;
	/************************************************************************/
	public static void main (String[] args) {
		bases();
		centerNeck();
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
		
	}
}
