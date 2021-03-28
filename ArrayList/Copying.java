/* copying from one array list to the other */

import java.util.*;

public class Copying{

  public static void main(String[] args){

    ArrayList<Double> list1 = new ArrayList<Double>();
    list1.add(3.14);
    list1.add(2.71);
    list1.add(6.02); //[3.14,2.71,6.02]

    //copying list1 into a new arraylist called list2
    ArrayList<Double> list2 = new ArrayList<Double>();
    for (int i = 0; i < list1.size(); i++){
      //progressively add the ith element of list1 to list2
      list2.add( list1.get(i) ); 
    }

    System.out.println("Original: " + list1);
    System.out.println("Copied: " + list2);

  }

}
