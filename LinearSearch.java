
public class LinearSearch implements Practice03Search {
	
	public int search(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;//return i when you found the target
			}
		}
		return -1;//return -1 if it's not in the array
	}

}