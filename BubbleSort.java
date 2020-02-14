
public class BubbleSort implements Practice03Sort {

    public void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; //swap a[i] and [j]
    }

    public void sort(int[] arr) {
        int passes = 1;
        boolean swapped = true;
        
        while(swapped){ //while the arr value is swapped
            swapped = false;
            for(int i = 0; i < arr.length - passes; i++){
                if(arr[i] > arr[i + 1]){ //if arr[i] is more than [arri+1] we swap them to sort the array.
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            passes += 1;
        }

    }
}
