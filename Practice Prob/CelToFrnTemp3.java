import java.util.*;
public class CelToFrnTemp3 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the current temperature of celcius: ");
  float cel = sc.nextFloat();
  float frh = (cel + 9/5) + 32;
  System.out.print(cel + " degrees Celsius is equal to  "+ frh + " degree Fahrenheit");

}

}
