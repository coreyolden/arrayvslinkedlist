
public class MyLLStack{
	//sets up an instance of linkedList
	private MyLinkedList linkedList = new MyLinkedList();
	
	/**takes the parameter num and pushes onto the linked list
	 * 
	 * @param num
	 */
	private void push(int num) {
		linkedList.insert(num);
	}
	
	/**sets current at head so it's always pulling the last element added in the list and then calls linkedList.delete()
	 * which returns the number and deletes the node
	 * 
	 * @return
	 */
	private int pop() {
		linkedList.setCurrent(linkedList.getHead());
		return linkedList.delete();
	}
	
	/**take the random number, convert to binary, store it in a node, and adds the node to the end of the linked list
	 * 
	 * @param input
	 */
	public void store(int input) {
		//convert the number to binary
		String binary = Integer.toBinaryString(input);
		
		for(int i = 0; i<binary.length(); i++) {
			//convert the character at binary[i] to an int and push it onto the linked list
			push(Character.getNumericValue(binary.charAt(i)));
		}
	}
	
	/**This will retrieve the number from the queue and convert it to decimal
	 * 
	 */
	public void toDecimal() {
		//set up variables for bin which is total binary number and digit which is each individual digit
		String bin = "";
		String digit;
		
		//get the linked list size for use in for loop
		int listSize = linkedList.getSize();
		for(int i = 0; i<listSize; i++) {
			//the number is stored as an int but I want it as a char to use integer.parse int later
			digit = Integer.toString(pop());
			bin = digit +bin;
			}
		//parse the string binary "bin" to the integer decimal which is the original number provided
		int decimal = Integer.parseInt(bin, 2);
		
	}
	
}
