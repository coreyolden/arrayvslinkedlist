
public class MyLLQueue {
	private MyLinkedList linkedList = new MyLinkedList();
	
	private void enqueue(int num) {
		linkedList.insert(num);
	}
	
	private int dequeue() {
		linkedList.setCurrent(linkedList.getTail());
		return linkedList.delete();
	}
	
	public void store(int input) {
		
		String binary = Integer.toBinaryString(input);
		for(int i = 0; i<binary.length(); i++) {
			enqueue(Character.getNumericValue(binary.charAt(i)));
		}
		}
	
	public void toDecimal() {
		String bin = "";
		String digit;
		int listSize = linkedList.getSize();
		for(int i = 0; i<listSize; i++) {
			digit = Integer.toString(dequeue());
			bin = bin+ digit;
			}
		int decimal = Integer.parseInt(bin, 2);
	}
}
