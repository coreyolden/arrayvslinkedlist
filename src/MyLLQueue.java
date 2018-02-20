
public class MyLLQueue {
	//sets up an instance of linkedList
	private MyLinkedList linkedList = new MyLinkedList();
	
	/**inserts the parameter num into the end of the link list line
	 * 
	 * @param num
	 */
	private void enqueue(int num) {
		linkedList.insert(num);
	}
	
	/**sets current to be the tail of the list and calls linkedList.delete() which returns the number and
	 * deletes the node
	 * 
	 * @return
	 */
	private int dequeue() {
		//set current to tail so it's at the end of the list
		linkedList.setCurrent(linkedList.getTail());
		//return number stored in the node and delete the node
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
			//get number at binary[i], convert it to an int, and enqueue it
			enqueue(Character.getNumericValue(binary.charAt(i)));
		}
		}
	
	/**This will retrieve the number from the queue and convert it to decimal
	 * 
	 */
	public void toDecimal() {
		//set up variables for bin which is total binary number and digit which is each individual digit
		String bin = "";
		String digit;
		
		//get the size of the linked list for use in the for loop
		int listSize = linkedList.getSize();
		
		
		for(int i = 0; i<listSize; i++) {
			//the number is stored as an int but I want it as a char to use integer.parse int later
			digit = Integer.toString(dequeue());
			bin = bin+ digit;
			}
		//parse the string binary "bin" to the integer decimal which is the original number provided
		int decimal = Integer.parseInt(bin, 2);
	}
}
