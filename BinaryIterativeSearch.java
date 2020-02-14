
public class BinaryIterativeSearch implements Practice03Search {

	public int search(int[] arr, int target) {
		int min=0;
		int max=arr.length-1;
		
		while(min<=max) { //While min is less or equal to max
			int mid=(min+max)/2;
			if(arr[mid]==target)
				return mid; //return mid if it is the target
			else if(arr[mid]<target)
				min=mid+1; //min becomes mid+1 if a[mid] is less than the target
			else
				max=mid-1; //max becomes mid-1 if a[mid] is more than the target
		}
		return -1;
	}
	
}
