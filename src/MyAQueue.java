
public class MyAQueue {
	private int arr[];
	private int back;
	private int front;
	public void store(int input) {
		String binary = Integer.toBinaryString(input);
		arr = new int[binary.length()];
		back = arr.length;
		front = arr.length;
		
		for(int i = 0; i<binary.length(); i++) {
			
			enqueue(Character.getNumericValue(binary.charAt(i)));
		}
		
		}
	private void enqueue(int num) {
		back--;
		arr[back]=num;
	}
	
	private int dequeue() {
		front--;
		return arr[front];
	}
	
	public void toDecimal() {
		String bin = "";
		String digit;
		for(int i = 0; i<arr.length; i++) {
			digit = Integer.toString(dequeue());
			bin = bin+digit;
			}
		int decimal = Integer.parseInt(bin, 2);
	}
	
}
