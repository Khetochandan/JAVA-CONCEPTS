import java.util.*;

public class CheckPrimeNub6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the num: ");
    int num = sc.nextInt();

    if(isPrime(num)){
      System.out.print(num + " is a prime num" );
    }
    else{
      System.out.print(num + " is not a prime num");
    }

  }

  public static boolean isPrime(int num) {
    if(num<=1){
       return false;  // all pn num >1 
    }
    for(int i =2; i<=Math.sqrt(num); i++){
       if(num % i ==0 ){
        return false;
       }
    }
    return true;
  }
}
