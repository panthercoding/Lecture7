import java.util.*;

public class Search{

  public static void main(String[] args){

    ArrayList<Integer> list = new ArrayList<Integer>();
    //creates an arraylist of [0,1,2,3,...,9]
    for (int i = 0; i < 10; i++){
      list.add(i);
    }
    System.out.println( binsert(list, Integer.parseInt(args[0]) ) );
    System.out.println(list);
  }

  //sequential search for a key on arraylist called list
  public static int seqSearch(ArrayList<Integer> list, int key){
    //searches through all elements iteratively
    for (int i = 0; i < list.size(); i++){
      if (list.get(i) == key)
        return(i); //return the index where the key was found
    }
    return(-1); //if key not found, return -1
  }
  
  //binary search through a sorted arraylist 
  public static int binSearch(ArrayList<Integer> list, int key){
    int min = 0, max = list.size() - 1; //set search boundaries
    //while there are elements to search
    while (min <= max){
      int mid = (min + max) / 2; //take a midpoint guess
      if (list.get(mid) == key)
        return(mid); //return index where key was found
      else if (list.get(mid) < key)
        min = mid + 1; //search upper half if the guess is too small
      else 
        max = mid - 1; //search lower half if the guess is too big
    }
    return(-1); //return -1 if not found
  }

  //binary search through an arraylist and insert the key
  //into the arraylist at the proper index if not found
  public static int binsert(ArrayList<Integer> list, int key){
    int min = 0, max = list.size() - 1; //set search boundaries
    int mid = 0;
    //while there are elements to search
    while (min <= max){
      mid = (min + max) / 2; //take a midpoint guess
      if (list.get(mid) == key)
        return(mid); //return index where key was found
      else if (list.get(mid) < key)
        min = mid + 1; //search upper half if the guess is too small
      else 
        max = mid - 1; //search lower half if the guess is too big
    }
    //if not found, insert the key into the proper sorted location 
    if (key > list.get(mid)){
      list.add(mid+1,key);
      return(mid+1);
    }
    else{
      list.add(mid,key);
      return(mid);
    }
  }
}
