
public class MyAQueue {
	private int arr[];
	private int back;
	private int front;
	
	
	/** take the random number, convert to binary, and store it in an array queue
	 * 
	 * @param input
	 */
	public void store(int input) {
		//convert the number to binary
		String binary = Integer.toBinaryString(input);
		//set the array length to be the number of digits in the binary
		arr = new int[binary.length()];
		//back is the last element in the queue and used for storing data
		back = arr.length;
		//front is the last element in the queue and used for retrieving data
		front = arr.length;
		
		
		for(int i = 0; i<binary.length(); i++) {
			//get the character at the binary location and call enqueue with it
			enqueue(Character.getNumericValue(binary.charAt(i)));
		}
		
		}
	
	/**take num as a parameter and store it at the back location in the array
	 * This is the end of the line
	 * 
	 * @param num
	 */
	private void enqueue(int num) {
		//increment back one spot when a new number is added
		back--;
		//store to number
		arr[back]=num;
	}
	/**This retrieves the number from the front of the line and pushes front back by one
	 * 
	 * @return
	 */
	private int dequeue() {
		front--;
		return arr[front];
	}
	
	/**This will dequeue the number and convert it to decimal
	 * 
	 */
	public void toDecimal() {
		//set up variables for bin which is total binary number and digit which is each individual digit
		String bin = "";
		String digit;
		
		//for each element in the array dequeue a number and add it to bin
		for(int i = 0; i<arr.length; i++) {
			//the number is stored as an int but I want it as a char to use integer.parse int later
			digit = Integer.toString(dequeue());
			bin = bin+digit;
			}
		//parse the string binary "bin" to the integer decimal which is the original number provided
		int decimal = Integer.parseInt(bin, 2);
	}
	
}
