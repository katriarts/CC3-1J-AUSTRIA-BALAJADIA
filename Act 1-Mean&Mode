
package array.mean.and.mode;
import java.util.Scanner;
public class ArrayMeanAndMode {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String user = "How many numbers will you input?: ";
        String invalid = "Not an Integer. Try Again: ";
        
        int array = inputInt(sc, user, invalid);
        int[] values = inputArray(sc, array);
        
        double mean = solveMean(values);
        double mode = solveMode(values);
        
         System.out.println("Mean: " + mean);
         System.out.println("Mode: " + mode);
        
    }
    
    public static int inputInt(Scanner sc, String message, String error){
        System.out.print(message);
        
        while(!sc.hasNextInt()){
            System.out.print(error);
            sc.nextLine();
        }
        int n = sc.nextInt();
        return n;
    }
    
    public static int[] inputArray(Scanner sc, int array){
        int[] values = new int[array];
        
        for(int i = 0; i < array; i++){
            String number = (i + 1) + ")";
            
            String error = "Not an Integer. Try Again: ";
            values[i] = inputInt(sc,number, error );
        }
        return values;
        
    }
    
    public static double solveMean(int[] arr)
	{
		int sum = 0;
		
		// Sum all values in our array
		for (int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
				
		// Calculate mean
		double mean = ((double) sum) / ((double) arr.length);
		
		return mean;
	}
    
    public static int[] bubbleSort(int[] arr)
	{
		boolean performedSwap = true;
		int tempValue = 0;
		
		while(performedSwap)
		{
			performedSwap = false;
						
			
			for (int i=0; i < arr.length; i++)
			{
				if (arr[i] > arr[i+1])
				{
					tempValue = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tempValue;
					
					performedSwap = true;
				}
			}
		}
		
		return arr;
	}
    
    public static int solveMode(int[] arr)
	{		
		int modeCount = 0;	
		int mode = 0;		

		int currCount = 0;	
		int currElement;
		
		
		for (int candidateMode : arr)
		{			
			currCount = 0;
			
			for (int element : arr)
			{
				if (candidateMode == element)
				{
					currCount++;
				}
			}
			
			if (currCount > modeCount)
			{
				modeCount = currCount;
				mode = candidateMode;
			}
		}		
		return mode;
	}
}

    
    
