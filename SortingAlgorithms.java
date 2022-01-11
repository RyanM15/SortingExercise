public class SortingAlgorithms{
	
	private int[] arr = {1, 2, 3};
	private int swaps = 0;
	private int temp = 0;
	private int min = 0;
	
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



	
		




