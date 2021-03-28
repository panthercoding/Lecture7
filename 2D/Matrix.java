import java.util.*;

/* two-dimensional arrays */

public class Matrix{

  public static void main(String[] args){
    
    /* initializes and declares a 2D array
    {1,2,3} is row 1, {4,5,6} is row 2
    */
    
    int[][] matrix = {{1,2,3},{4,5,6}};
    printMatrixCol(matrix);
    // 1 4 
    // 2 5 
    // 3 6

  }

  public static void printArray(int[][] matrix){
    //searches through the rows
    for (int row = 0; row < matrix.length; row++){
      //searches each column of a row 
      for (int col = 0; col < matrix[row].length; col++){
        System.out.print(matrix[row][col] + " ");
      }
      System.out.println(); //creates next line for new row
    }
  }

  //easier way using more streamlined for loops
  public static void printMatrix(int[][] matrix){
    for (int[] row: matrix){ //search each row of the matrix
      for (int element: row){ //search element inside the row
        System.out.print(element + " "); //print out element
      }
      System.out.println(); //creates next line for new row
    }
  } 

  //printing by accessing columns first and rows secondary
  public static void printMatrixCol(int[][] matrix){
    //searches through the columns (assuming rectangular matrix)
    //which means that all rows have the same number of columns
    for (int col = 0; col < matrix[0].length; col++){
      //searches each row of the column
      for (int row = 0; row < matrix.length; row++)
        System.out.print(matrix[row][col] + " ");
      System.out.println(); //creates next line for new column
    }
  }

}
