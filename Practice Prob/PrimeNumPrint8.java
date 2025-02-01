import java.util.*;
public class PrimeNumPrint8 {

  public static boolean isPrime(int high) {
    if(high<=1){
        return false;
      }

      for(int j=2; j<=Math.sqrt(high); j++){
         if(high % j == 0){
           return false;
         }
      } 
      return true;
   }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the num: ");
    int high = sc.nextInt();
    System.out.println("Prime nums from 1 to " + high + ":");
    
    for(int i=2; i<=high; i++){

    if(isPrime(i)){
      System.out.print(i + " ");
    }
    }
    }
  }

    
    
  
  

