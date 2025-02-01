import java.util.*;
public class LeapYrCheck11{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the year: ");
    int yr = sc.nextInt();
  
 // divided by 100 means century year (ending with 00)
 // century year divided by 400 is leap year
   if(yr % 100 == 0 && yr % 400 == 0){
    System.err.println( yr + " is a leap year");
   }
 
 // not divided by 100 means not a century year
 // year divided by 4 is a leap year
 else if (yr % 4 == 0 && yr % 100 != 0){
  System.out.println( yr + " is a leap year");
 }
 // if not divided by both 400 (century year) and 4 (not century year)
 // year is not leap year
 else{
  System.out.println( yr + " is not a leap year");
  
 }
}
}
