import java.util.*;
public class EvenOddCheak5 {
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the num: ");
    int num = sc.nextInt();

    if(num % 2 ==0){
      System.out.print(num + " is even num");
    }
    else{
      System.out.println(num + " is odd num");
    }
  }
  
}
