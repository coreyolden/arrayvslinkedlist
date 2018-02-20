
public class MyNode {
	//stored data
	private int myNum;
	//next node in list
	private MyNode next;
	//previous node in list
	private MyNode previous;
	
	/**returns the next node in the list
	 * 
	 * @return
	 */
	public MyNode getNext() {
		return next;
	}
	
	/**Returns the previous node in the list
	 * 
	 * @return
	 */
	public MyNode getPrevious() {
		return previous;
	}
	
	/**returns the value stored in the node
	 * 
	 * @return
	 */
	public int getData() {
		return myNum;
	}
	
	/**takes the number parameter and stores it in the node
	 * 
	 * @param num
	 */
	public void setData(int num) {
		myNum = num;
	}
	
	/**allows the linked list to set the next value of this node
	 * 
	 * @param nextNode
	 */
	public void setNext(MyNode nextNode) {
		next = nextNode;
	}
	
	/**allows the linked list to set the previous value of this node
	 * 
	 * @param lastNode
	 */
	public void setPrevious(MyNode lastNode) {
		previous = lastNode;
	}
}
