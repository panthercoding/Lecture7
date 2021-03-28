/* contrast array and arraylist traversal */

import java.util.*;

public class Traversal{

  public static void main(String[] args){

    int[] numbers = {10,12,14,16};

    for (int i = 0; i < numbers.length; i++){
      System.out.println( numbers[i] );
    }

    ArrayList<Integer> favNumbers = new ArrayList<Integer>();
    favNumbers.add(1);
    favNumbers.add(10);
    favNumbers.add(100);

    for (int i = 0; i < favNumbers.size(); i++){
      System.out.println( favNumbers.get(i) );
    }

  }
}
