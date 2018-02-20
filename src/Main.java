import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {

	
	/** The main method will have an number "N" where you will be able to select how many times it will store the number
	 * There is a for loop so that it will run all functions to store the number in linked list and array form N times
	 * The average will be calculated at the end and displayed.
	 * @param args
	 * @throws IOException 
	 */
public static void main(String[] args) throws IOException {
	
	
	// N input for changing the number of stores.
	int n=100000;
	
	// Declaring all relevant classes and variables
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
	
	
	String filename= "hw2cs3310_CoreyOldenberg.txt";
	FileWriter fw = new FileWriter(filename,true);
	fw.write("                    N = "+n);
	
	
	
	// this is the loop that does the storing and to decimal N time
	for(int i = 0; i<n; i++) {
		int numToStore = rand.nextInt(Integer.MAX_VALUE);
		
		//The instruction said to only display the output if it's less than or equal to N=500
		if(n<= 500) {
			
		// print info and write to file
		System.out.println("\n__LL-based Stack__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore));
		fw.write("\n__LL-based Stack__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore)+"\n");
		// start the clock
		startTime = System.nanoTime();
		//store converts to binary and stores it 
		myLStack.store(numToStore);
		//unpack the binary and convert to int
		myLStack.toDecimal();
		//get the total time for the run
		singleTime = System.nanoTime() - startTime;
		//add time to running total
		totalLStack += singleTime;
		// display results
		System.out.println("Time taken: "+singleTime+" ns");
		fw.write("Time taken: "+singleTime+" ns\n");
		
		//The next few results repeat the prior steps although using different methods as instructed
		//as such they will be uncommented to prevent clutter
		
		System.out.println("\n__Array-based Stack__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore));
		fw.write("\n__Array-based Stack__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore)+"\n");
		startTime = System.nanoTime();
		myAStack.store(numToStore);
		myAStack.toDecimal();
		singleTime = System.nanoTime() - startTime;
		totalAStack += singleTime;
		System.out.println("Time taken: "+singleTime+" ns");
		fw.write("Time taken: "+singleTime+" ns\n");
		
		System.out.println("\n__LL-based Queue__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore));
		fw.write("\n__LL-based Queue__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore)+"\n");
		startTime = System.nanoTime();
		myLQueue.store(numToStore);
		myLQueue.toDecimal();
		singleTime = System.nanoTime() - startTime;
		totalLQueue += singleTime;
		System.out.println("Time taken: "+singleTime+" ns");
		fw.write("Time taken: "+singleTime+" ns\n");
		
		System.out.println("\n__Array-based Queue__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore));
		fw.write("\n__Array-based Queue__\nDecimal: "+numToStore+"\nBinary: "+Integer.toBinaryString(numToStore)+"\n");
		startTime = System.nanoTime();
		myAQueue.store(numToStore);
		myAQueue.toDecimal();
		singleTime = System.nanoTime() - startTime;
		totalAQueue += singleTime;
		System.out.println("Time taken: "+singleTime+" ns");
		fw.write("Time taken: "+singleTime+" ns\n");
		
		
		System.out.println("\n----------\n");
		fw.write("\n----------\n\n");
		}else {
			
			//This is the same as the above section however will not print the information as N>500
			
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
	//calculate average times
	long averageLStack = totalLStack /n;
	long averageAStack = totalAStack /n;
	long averageLQueue = totalLQueue /n;
	long averageAQueue = totalAQueue /n;
	
	//display all results and prints them to file
	System.out.println("\nAverage time for LL-based stack: "+ averageLStack+" ns");
	fw.write("\nAverage time for LL-based stack: "+ averageLStack+" ns\n");
	System.out.println("Average time for Array-based stack: "+ averageAStack+" ns");
	fw.write("Average time for Array-based stack: "+ averageAStack+" ns\n");
	System.out.println("Average time for LL-based queue: "+ averageLQueue + " ns");
	fw.write("Average time for LL-based queue: "+ averageLQueue + " ns\n");
	System.out.println("Average time for Array-based queue: " + averageAQueue + " ns");
	fw.write("Average time for Array-based queue: " + averageAQueue + " ns\n");
	
	//closefile
	fw.write("\n\n----------End Of Run----------\n\n");
	fw.close();
}



}
