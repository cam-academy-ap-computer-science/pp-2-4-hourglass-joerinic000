/***** 
 * Grading Comments:   27/25 pts
 * Excellent. 
 *  Clean and nicely done. 
 * As about as good as it could be. 
 * Correct Output 10/10
 * Proper Use of Static Methods 3/3
 * Proper Use of for loops 3/3
 * Pseudocode 3/3
 * Comments 2/2
 * Consistent Layout and Style 2/2  
 * Proper Use of Class Constant 2/2    
 * Resizing extra credit: 2/2
 */ 
/*Pseudocode for Hourglass
	The constant should be used to determine the height, or number of lines, in each half of the hourglass, HALF_HEIGHT
	
	Shape:
	draw Line
	draw Top
	draw Centre
	draw Bottom
	draw Line
	
	draw Line:
	Print a "|"
	In the for loop, multiply the constant by 2 and add 2
	In the loop, print a " until amount is equal to (HALF_HEIGHT*2+2)
	Print a "|"
	
	draw Top:
	Print a space(s) dependent on how far down the hourglass you are
	Print a "\"
	Loop printing ":" dependent on how far down you are
	Print a "/"
	
	draw Centre:
	Print 5 spaces
	Print"||"
	
	draw Bottom:
	Print a space(s) dependent on how far down the hourglass you are
	Print a "/"
	Loop printing ":" dependent on how far down the hourglass you are
	Print a "\"
	
			
*/

public class Hourglass {
	public static final int HALF_HEIGHT = 4; //Change the variable and it works to change the height
	
	public static void main(String[] args) {
		drawLine();
		drawTop();
		drawCentre();
		drawBottom();
		drawLine();
	}
	public static void drawLine() { //Prints the top and bottom lines
		System.out.print("|");
		for(int i = 1; i <= (HALF_HEIGHT * 2 + 2); i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void drawTop() { //Prints top half w/o line
		for(int space = 1; space <= HALF_HEIGHT; space++) {
			for(int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			
			for(int i = 1; i <= (2 * HALF_HEIGHT - 2 * space + 2); i++) {
				System.out.print(":");
			}
			System.out.println("/");
		}
	}
	public static void drawCentre() { //Prints the two verical lines in the centre
		for(int i = 1; i <= HALF_HEIGHT + 1; i++) { 
			System.out.print(" ");
		}
		System.out.print("||\n");
	}
	public static void drawBottom() { //Prints bottom w/o line
		for(int space = 1; space <= HALF_HEIGHT; space++) { 
			for(int i = 1; i <= (HALF_HEIGHT - space) + 1; i++ ) {
				System.out.print(" ");
			}
			System.out.print("/");
			for(int i = 1; i <= 2 * (space - 1) + 2; i++) {
				System.out.print(":");
			
			}
			System.out.println("\\");
		}
	}
}
