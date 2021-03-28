import java.util.*;

public class SelectionSort{

  public static void main(String[] args){

    int[] numbers = {1,5,4,-10,6};
    selectionSort(numbers);
    System.out.println( Arrays.toString(numbers) );
  }

  /* looks for smallest element and swaps with first element
  looks for second smallest, swaps with second element, and so forth */
  public static void selectionSort(int arr[]){
    for (int i = 0; i < arr.length - 1; i++){
      //find minimum value from i to end of array 
      int min_index = i;
      for (int j = i + 1; j < arr.length; j++){
        //found value smaller than current minimum
        if (arr[j] < arr[min_index])
          min_index = j;
      }
      //swap minimum with current element at index i
      swap(arr,min_index,i);
    }
  }

  /* swap values at index1 and index2 */
  public static void swap(int arr[], int index1, int index2){
    int temp = arr[index1]; //preserve original value at index1
    arr[index1] = arr[index2]; //change value at index1
    arr[index2] = temp; //change value at index2
  }

}
