/* based on the analysis of magic squares */

//analyzing magic squares

public class Square{

  //the n x n matrix of the square
  private int[][] matrix;
  private int n; //number of rows or coluns

  public Square(int[][] square){
    matrix = square;
    n = square.length;
  }

  public boolean isMagic(){
    //set boolean -> only changed 
    boolean isMagicSquare = true;
    int sum = rowSum(0); //find sum of 0th row
    //check all of the row sums
    for (int row = 0; row < matrix.length; row++){
      if (rowSum(row) != sum)
        isMagicSquare = false;
    }

    for (int col = 0; col < matrix[0].length; col++){
      if (colSum(col) != sum)
        isMagicSquare = false;
    }

    if (!diagSums(sum))
      isMagicSquare = false;

    return(isMagicSquare); 
  }

  public int rowSum(int rowNumber){
    int sum = 0; //looks through all columns of the row
    for (int col = 0; col < matrix[rowNumber].length; col++){
      sum += matrix[rowNumber][col]; //adds element to the sum
    }
    return(sum); 
  }

  public int colSum(int colNumber){
    int sum = 0; //looks through all rows of the column
    for (int row = 0; row < matrix.length; row++){
      sum += matrix[row][colNumber]; //adds element to the sum
    }
    return(sum);
  }

  public boolean diagSums(int sum){
    int downwardDiagonalSum = 0;
    for (int i = 0; i < matrix.length; i++){
      downwardDiagonalSum += matrix[i][i];
    }

    int upwardDiagonalSum = 0;
    for (int i = 0; i < matrix.length; i++){
      upwardDiagonalSum += matrix[matrix.length - i - 1][i];
    }

    return((sum == downwardDiagonalSum) && (sum == upwardDiagonalSum));
  }

}
  
