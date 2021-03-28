
import java.util.*; //includes ArrayList class

public class InsertionSort{

  public static void main(String[] args){
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    //construct arraylist with 10 random integers between 0 and 9
    for (int i = 0; i < 10; i++){
      int newElement = (int) (Math.random() * 10);
      list.add(newElement);
    }

    System.out.println("Original: " + list);
    insertionSort(list);
    System.out.println("Sorted: " + list);
  }

  public static void insertionSort(ArrayList<Integer> list){
    for (int i = 1; i < list.size(); i++){
      //temporarily remove ith element and store in element */
      int element = list.remove(i);
      /* insert this element in the correct place from 
          index 0 to index i - 1 */
      int index = i - 1;
      while (index >= 0 && list.get(index) > element)
        index--; 
      //add the element in the sorted position
      list.add(index + 1, element);
    }
  }

}
