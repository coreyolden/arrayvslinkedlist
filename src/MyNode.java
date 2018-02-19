
public class MyNode {
	private int myNum;
	private MyNode next;
	private MyNode previous;
	
	public MyNode getNext() {
		return next;
	}
	public MyNode getPrevious() {
		return previous;
	}
	public int getData() {
		return myNum;
	}
	
	public void setData(int num) {
		myNum = num;
	}
	
	public void setNext(MyNode nextNode) {
		next = nextNode;
	}
	public void setPrevious(MyNode lastNode) {
		previous = lastNode;
	}
}
