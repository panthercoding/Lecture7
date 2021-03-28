public class MatrixSearch{

  public static boolean search2D(int[][] matrix, int key){
    //search all rows of the matrix
    for (int row = 0; row < matrix.length; row++){
      if (seqSearch(matrix[row],key) != -1) //if the key was found
        return(true); 
    }
    return(false); //return false is key never found
  }
  
  public static int seqSearch(int[] arr, int key){
    for (int i = 0; i < arr.length; i++){
      if (arr[i] == key) //if element equals key
        return(i); //return index where element found
    }
    return(-1); //return -1 if not found
  }

  public static void main(String[] args){
    int[][] mat = {{1,2,3},{4,5,6}};

    System.out.println(search2D(mat,7));
  }
}
