import java.util.Random;

public class Main {

	
	
public static void main(String[] args) {
	int n=3;
	Random rand = new Random();
	MyAStack myAStack = new MyAStack();
	MyAQueue myAQueue = new MyAQueue();
	MyLLStack myLStack = new MyLLStack();
	MyLLQueue myLQueue = new MyLLQueue();
	long totalAStack = 0;
	long totalLStack = 0;
	long totalAQueue = 0;
	long totalLQueue = 0;
	long startTime = 0;
	long singleTime = 0;
	for(int i = 0; i<n; i++) {
		int numToStore = rand.nextInt(Integer.MAX_VALUE);
		if(n<= 500) {
		System.out.println("\n__LL-based Stack__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore));
		startTime = System.nanoTime();
		myLStack.store(numToStore);
		myLStack.toDecimal();
		singleTime = System.nanoTime() - startTime;
		totalLStack += singleTime;
		System.out.println("Time taken: "+singleTime+" ns");
		
		System.out.println("\n__Array-based Stack__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore));
		startTime = System.nanoTime();
		myAStack.store(numToStore);
		myAStack.toDecimal();
		singleTime = System.nanoTime() - startTime;
		totalAStack += singleTime;
		System.out.println("Time taken: "+singleTime+" ns");
		
		System.out.println("\n__LL-based Queue__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore));
		startTime = System.nanoTime();
		myLQueue.store(numToStore);
		myLQueue.toDecimal();
		singleTime = System.nanoTime() - startTime;
		totalLQueue += singleTime;
		System.out.println("Time taken: "+singleTime+" ns");
		
		System.out.println("\n__Array-based Queue__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore));
		startTime = System.nanoTime();
		myAQueue.store(numToStore);
		myAQueue.toDecimal();
		singleTime = System.nanoTime() - startTime;
		totalAQueue += singleTime;
		System.out.println("Time taken: "+singleTime+" ns");
		
		
		System.out.println("\n----------\n");
		}else {
			startTime = System.nanoTime();
			myLStack.store(numToStore);
			myLStack.toDecimal();
			singleTime = System.nanoTime() - startTime;
			totalLStack += singleTime;
			
			startTime = System.nanoTime();
			myAStack.store(numToStore);
			myAStack.toDecimal();
			singleTime = System.nanoTime() - startTime;
			totalAStack += singleTime;
			
			startTime = System.nanoTime();
			myLQueue.store(numToStore);
			myLQueue.toDecimal();
			singleTime = System.nanoTime() - startTime;
			totalLQueue += singleTime;
			
			startTime = System.nanoTime();
			myAQueue.store(numToStore);
			myAQueue.toDecimal();
			singleTime = System.nanoTime() - startTime;
			totalAQueue += singleTime;
			
			
		}
		
		
		
	}
	System.out.println("\nAverage time for LL-based stack: "+ totalLStack+" ns");

	System.out.println("Average time for Array-based stack: "+ totalAStack+" ns");

	System.out.println("Average time for LL-based queue: "+ totalLQueue + " ns");

	System.out.println("Average time for Array-based queue: " + totalAQueue + " ns");
	

}



}
