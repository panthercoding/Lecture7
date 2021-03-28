public class DigitRunner{

  public static void main(String[] args){

    Digits d = new Digits(12569);
    if (d.isStrictlyIncreasing()){
      System.out.println("Is Strictly Increasing");
    }
    else{
      System.out.println("Not Striclty Increasing");
    }
  }

}
