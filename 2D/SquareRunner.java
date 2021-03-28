import java.io.*;

import java.util.Scanner;

public class SquareRunner{

  public static void main(String[] args){

    int[][] magic = readMatrix(args[0],Integer.parseInt(args[1]));

    Square s = new Square(magic);

    if (s.isMagic())
      System.out.println("Is Magical Square!");
    else
      System.out.println("Is NOT a Magical Square!");

  }

  public static int[][] readMatrix(String filename, int n){
      int[][] matrix = new int[n][n];
      try{
      File file = new File(filename);
      Scanner reader = new Scanner(file);
      for (int i = 0; i < n; i++){
        String data = reader.nextLine();
        String[] tokens = data.split(" ");
        for (int j = 0; j < n; j++){
          matrix[i][j] = Integer.parseInt(tokens[j]);
        }
      }
      reader.close();
      }
      catch (FileNotFoundException ex) {
        System.out.println("ERROR!");
      }
      return(matrix);
    }

}
