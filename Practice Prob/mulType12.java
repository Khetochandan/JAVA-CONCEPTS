import java.util.*;

public class mulType12 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Num: ");
   int num = sc.nextInt();
       mulTable(num);
      // additionTable();
}
   public static void  mulTable(int num){
    System.out.println ("Multiple table of " + num+ " is: ");
      for(int i=1; i<=10; i++){
       int result = num*i;
        System.out.println(num +"*" +i +"=" + result );
        
    }
  }
}

