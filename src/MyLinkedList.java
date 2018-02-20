
public class MyLinkedList {
	//all node pointers to keep track of.
	 private MyNode head;
	 private MyNode tail;
	 private MyNode current;
	 private int size = 0;
	
	/** this takes a number, stores it in a new node and sets that new node to be head so it's at the end of the line
	 * 
	 * @param num
	 */
	public void insert(int num) {
		//create the new node
		current = new MyNode();
		//store the value in the node
		current.setData(num);
		//set the next node to head
		current.setNext(head);
		//set the current node to be the new head of the list
		head = current;
		//if size is 0 then the node is the only one so it's also tail
		if(size == 0) {
			tail=current;
		}else { //if its not the only one set it to previous of the next node
			head.getNext().setPrevious(head);
		}
		//increment size
		size++;
	}
	
	/**returns the number stored in node and deletes the node
	 * 
	 * @return
	 */
	public int delete() {
		//get the data from the node
		int num= current.getData();
		//if current is head then I'm using a stack
		if (current == head && current != tail ) {
			//sets head to be the next node
			head = current.getNext();
			//detaches the current node from head
			head.setPrevious(null);
			//detach head from current
			//current now has nothing pointing to it and will be picked up by garbage handling
			current.setNext(null);
			
			//if tail is current then I'm using queue
		}else if (tail == current && current != head) {
			//set tail to be the next element in the list
			tail=current.getPrevious();
			
			//detach current form the node and garbage hanlding will take care of it
			current.setPrevious(null);
			tail.setNext(null);
		}
		//decrement size as a node is now taken away
		size--;
		//all elements have been deleted so set everything to null
		if(size == 0) {
			head = null;
			tail = null;
			current = null;
					
		}
		//return the number from the original node
		return num;
	}
	
	/**returns the number of elements in the linked list
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}
	
	/**allows the current node to be set
	 * 
	 * @param node
	 */
	public void setCurrent(MyNode node) {
		current = node;
	}
	
	/**allows head to be set
	 * 
	 * @param node
	 */
	public void setHead(MyNode node) {
		head = node;
	}
	
	/**allows tail to be set 
	 * 
	 * @param node
	 */
	public void setTail(MyNode node) {
		tail = node;
	}
	
	/**returns a pointer to the head node
	 * 
	 * @return
	 */
	public MyNode getHead() {
		return head;
	}
	
	/**returns a pointer to the tail node
	 * 
	 * @return
	 */
	public MyNode getTail() {
		return tail;
	}
	
	/**returns a pointer to the current node
	 * 
	 * @return
	 */
	public MyNode getCurrent() {
		return current;
	}
}
