import java.util.*;

/* representing the digits of a number through a sequenced array list */
/* based on AP CSA free response prompt */

public class Digits{

  private ArrayList<Integer> digitList;

  public Digits(int num){
    digitList = new ArrayList<Integer>(); //initializes the list
    while (num > 0){
      int digit = num % 10; //extract units digit 
      digitList.add(0,digit); //add digit to front of list 
      num = num / 10; //get rid of current units digit
    }
    if (num = 0){ //if number is 0, just create a 1-elem list with 0
      digitList.add(0);
    }
  }

  public boolean isStrictlyIncreasing(){
    boolean strictly = true;
    //search each consecutive pair of digits 
    for (int i = 0; i < digitList.size() - 1; i++){
      //if a digit is >= than the digit that comes after it
      if (digitList.get(i) >= digitList.get(i+1)){
        strictly = false; //it is not strictly increasing
      }
    }
    return(strictly);
  }

}
