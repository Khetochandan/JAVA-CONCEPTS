import java.util.*;
public class Factorial9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Num: ");
    int n = sc.nextInt();
    long fact = calcFact(n);
    System.out.print("Factorial of " + n + " is : " + fact);
  }

    public static long calcFact(int n){
    long fact = 1;
    for(int i=2; i<=n; i++){
    fact=fact*i;
    
   }
   return fact;
 }
}
  

