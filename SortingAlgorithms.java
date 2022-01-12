public class SortingAlgorithms{
	
	private int[] array = {95,85,89,69,76,84,86,65,52,86,46,65,45,59,76,66,22,1,91,86,14,6,68,31,57,50,90,80,8,87,42,76,48,35,91,73,50,9,56,8,76,17,64,3,30,99,5,26,4,24,44,92,63,84,48,58,56,33,13,31,10,90,13,48,24,93,64,60,49,84,76,69,48,12,81,61,58,9,19,34,61,34,58,89,4,78,55,58,30,58,73,36,11,55,14,60,63,48,53,41};
	
	
	
	public void bubbleSort(){ 
		int[] arr = new int[array.length];
		for (int i = 0; i < array.length; i++){
			arr[i] = array[i];
		}
	
	int swaps = 0;
	int temp = 0;
	
	
	
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


	public void selectionSort(){ 
		
		int[] arr = new int[array.length];
		for (int i = 0; i < array.length; i++){
			arr[i] = array[i];
		}
	
		
		int swaps = 0;
		int temp = 0;
		int min = 0;
		
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
				//System.out.print(swaps);
			}
		}
		System.out.print(swaps);
		






}

	public void insertionSort(){ 
		
		int[] arr = new int[array.length];
		for (int i = 0; i < array.length; i++){
			arr[i] = array[i];
		}
	
		
		int swaps = 0;
		int temp = 0;
		int min = 0;
		
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




		




