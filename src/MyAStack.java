
public class MyAStack {
	private int arr[];
	private int top;
	
	/**take the random number, convert to binary, and store it in an array stack
	 * 
	 * @param input
	 */
	public void store(int input) {
		//convert the number to binary
		String binary = Integer.toBinaryString(input);
		//set the array length to be the number of digits in the binary
		arr = new int[binary.length()];
		//set top to be the last element in the array
		top = arr.length;
		
		for(int i = 0; i<binary.length(); i++) {
			//get the character at the binary location and call push with it
			push(Character.getNumericValue(binary.charAt(i)));
		}
		
		}
	
	/**take num as a parameter and store it at the top location in the array
	 * This is the end of the line
	 * 
	 * @param num
	 */
	private void push(int num) {
		//increment top after a number is added
		top--;
		//place the number at top of the array
		arr[top]=num;
		
	}
	
	/**This retrieves the number from the front of the line and pushes front back by one
	 * 
	 * @return
	 */
	private int pop() {
		//push top one more towards the end of the array
		top++;
		//Retrieve the number
		return arr[top-1];
		
	}
	
	/**This will retrieve the number and convert it to decimal
	 * 
	 */
	public void toDecimal() {
		//set up variables for bin which is total binary number and digit which is each individual digit
		String bin = "";
		String digit;
		
		//for each element in the array pop a number and add it to bin
		for(int i = 0; i<arr.length; i++) {
			//the number is stored as an int but I want it as a char to use integer.parse int later
			digit = Integer.toString(pop());
			bin = digit +bin;
			}
		//parse the string binary "bin" to the integer decimal which is the original number provided
		int decimal = Integer.parseInt(bin, 2);
	}
	
}
