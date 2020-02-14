
public class BinaryRecursiveSearch implements Practice03Search {
	
	
public int search(int [] arr,int target) {
		
		return binarySearch(arr,target,0,arr.length-1);
	}

	public int binarySearch(int[] arr,int target,int min,int max) {
	
		int mid=(max+min)/2;
		if(min>max) // Base case;
			return -1; //If the target doesn't exist return 1-
		else if(arr[mid]==target) 
			return mid;//return mid if it is the target
		else if(arr[mid]>target)
			return binarySearch(arr,target,min,mid-1);//go through binary search again if target is less than arr[mid]
		else 
			return binarySearch(arr,target,mid+1,max);//go through binary search again if target is more than arr[mid]	
	}

}
