import java.util.*;

public class List2{

  public static void main(String[] args){

    ArrayList<String> students = new ArrayList<String>();

    students.add("Donovan");
    students.add("Jessica");
    students.add("Paul"); //["Donovan","Jessica","Paul"]

    /* set index2 to Chris and store string
    that was previously at index 2 ("Paul") */
    String s1 = students.set(2,"Chris");
    //["Donovan","Jessica","Chris"], s1 = "Paul"

    String s2 = students.get(1); //s2 = "Jessica"

    //printing out all of the names by traversal
    int numStudents = students.size();
    for (int i = 0; i < numStudents; i++){
      System.out.println( students.get(i) );
    }

  }
}
