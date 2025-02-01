import java.util.*;
public class RangleTry2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the rows: ");
      int n = input.nextInt();
      
      for(int i = 1; i<=n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print("&  ");
        }
        System.out.println("");
      }
     System.out.println("The reverse try:");
      for(int i =n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("%  ");
        }
       System.out.println("");
    }

    
    }
    
}
