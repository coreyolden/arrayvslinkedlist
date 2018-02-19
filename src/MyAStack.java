
public class MyAStack {
	private int arr[];
	private int top;
	public void store(int input) {
		String binary = Integer.toBinaryString(input);
		arr = new int[binary.length()];
		top = arr.length;
		
		for(int i = 0; i<binary.length(); i++) {
			
			push(Character.getNumericValue(binary.charAt(i)));
		}
		
		}
	private void push(int num) {
		top--;
		arr[top]=num;
		
	}
	
	private int pop() {
		top++;
		return arr[top-1];
		
	}
	
	public void toDecimal() {
		String bin = "";
		String digit;
		for(int i = 0; i<arr.length; i++) {
			digit = Integer.toString(pop());
			bin = digit +bin;
			}
		int decimal = Integer.parseInt(bin, 2);
	}
	
}
