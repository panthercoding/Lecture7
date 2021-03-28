import java.util.*;

public class List1{

  public static void main(String[] args){

    //creating an array list to store Integer objects
    //must use Integer wrapper class rather than int
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    //add three Integers to the arraylist
    numbers.add(10); //[10]
    numbers.add(15); //[10,15]
    numbers.add(-10); //[10,15,-10]

    //insert 0 into index 2, shifting the other entries
    numbers.add(2,0);  //[10,15,0,-10]

    //numbers is currently [10,15,0,-10]
    //change the number at index 1 to the Integer 100
    int elem1 = numbers.set(1,100);  //[10,100,0,-10], elem1 = 15
    //remove the number at index 3
    int elem3 = numbers.remove(3);  //[10,100,0], elem3 = -10

    System.out.println(numbers); 
    //accessing the element at index 1
    System.out.println(numbers.get(1));

  }
}
