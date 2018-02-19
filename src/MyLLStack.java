
public class MyLLStack{
	private MyLinkedList linkedList = new MyLinkedList();
	private void push(int num) {
		linkedList.insert(num);
	}
	private int pop() {
		linkedList.setCurrent(linkedList.getHead());
		return linkedList.delete();
	}
	
	public void store(int input) {
		String binary = Integer.toBinaryString(input);
		for(int i = 0; i<binary.length(); i++) {
			push(Character.getNumericValue(binary.charAt(i)));
		}
	}
	public void toDecimal() {
		String bin = "";
		String digit;
		int listSize = linkedList.getSize();
		for(int i = 0; i<listSize; i++) {
			digit = Integer.toString(pop());
			bin = digit +bin;
			}
		int decimal = Integer.parseInt(bin, 2);
		
	}
	
}
