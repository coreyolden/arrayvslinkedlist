
public class MyLinkedList {
	 private MyNode head;
	 private MyNode tail;
	 private MyNode current;
	 private int size = 0;
	
	public void insert(int num) {
		current = new MyNode();
		current.setData(num);
		current.setNext(head);
		head = current;
		if(size == 0) {
			tail=current;
		}else {
			head.getNext().setPrevious(head);
		}
		size++;
	}
	
	public int delete() {
		int num= current.getData();
		if (current == head && current != tail ) {
			current.getNext().setPrevious(null);
			head = current.getNext();
			current.setNext(null);
		}else if (tail == current && current != head) {
			tail=current.getPrevious();
			current.setPrevious(null);
			tail.setNext(null);
		}
		size--;
		//all elements have been deleted so set everything to null
		if(size == 0) {
			head = null;
			tail = null;
			current = null;
					
		}
		
		return num;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setCurrent(MyNode node) {
		current = node;
	}
	public void setHead(MyNode node) {
		head = node;
	}
	public void setTail(MyNode node) {
		tail = node;
	}
	
	public MyNode getHead() {
		return head;
	}
	public MyNode getTail() {
		return tail;
	}
	public MyNode getCurrent() {
		return current;
	}
}
