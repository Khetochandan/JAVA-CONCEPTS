import java.util.*;
public class NumCheak4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Num: ");
    int num = sc.nextInt();

    if(num>0){
      System.out.println(num + " is positive num");
    }
    else if(num==0){
      System.out.println(num + "  is zero");
    }
    else{
      System.out.println(num + " is negative num");
    }
  }
  
}
