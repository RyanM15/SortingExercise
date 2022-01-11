public class SortingAlgorithms{
	//variables used throughout the program in all three methods
	private int[] arr = {1, 2, 3};
	private int swaps = 0;
	private int temp = 0;
	private int min = 0;
	
	//Bubble Sort. Takes an array and compares the first two numbers, finds the larger value and places it on the right. This is repeated throuhgout the array until the 
	//largest number is to the far right. It then repeats the process until the array has been sorted in increasing order.
	public void bubbleSort(){  
	
	
	int counter = 10;
	
	
	while(counter != 0)
	{
		
		counter = 0;
	
		
	for (int x = 0; x < arr.length - 1; x++){
		if (arr[x] > arr[x + 1]){
			temp = arr[x + 1];
			arr[x + 1] = arr[x];
			arr[x] = temp;
			counter++;
			swaps++;
		}
		
	}
	
	
	}
	 System.out.print(swaps);
}

	//Sellection Sort. Sets the first number in an array to the minimum value, then goes through the rest of the array and compares that value to every other value and if 
	//another number is smaller then it sets that number to the minimum. Once the program reaches the end of the array the minimum is set to the left of the array. This 
	//process is repeated until the array is sorted in increasing order.
	public void selectionSort(){ 
		
		for (int x = 0; x < arr.length - 1; x++){
			
			min = x;
			for(int y = x; y < arr.length; y++){
				if(arr[y] < arr[min])
				{
					min = y;
				}
			}
			if (min != x){
				temp = arr[x];
				arr[x] = arr[min];
				arr[min] = temp;
				swaps++;
			}
		}
		System.out.print(swaps);
		






}
	//Insertion Sort. Assumes the first number in the array is sorted. Then it goes to the next number, and if that number is less that the already sorted number, it moves 
	//that number to the left of the already sorted number. If that number is larger, then it sees it as already sorted and continues. This process is repeated until the 
	//array is sorted in increasing order. 
	public void insertionSort(){ 
		for(int x = 1; x < arr.length; x++){
			
			
			temp = arr[x];
			int y = x ;
			while(y>0 && arr[y-1]>temp){
				arr[y] = arr[y-1];
				y--;
				swaps++;
			}
			arr[y] = temp;
		}
		System.out.println(swaps);
		
		
		/*
		for (int k = 0;  k < arr.length; k++)
			{
				System.out.print(arr[k] + ", ");
			
			}
			System.out.println("");
		*/
		
		

}
}



	
		




