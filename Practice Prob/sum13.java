import java.util.*;
public class sum13 {
public static double readNum() {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the num: ");
  double num = sc.nextDouble();
  return num;
}
  public static void main(String[] args) {
  call();
  double first = readNum();
  double sec = readNum();
  double third = readNum();
  double mul = (first* sec* third);
  System.out.println("The result of mul is: " + mul);
  double sum = (first+ sec + third);
  double avg = (first+ sec + third)/3;
  System.out.println("The result of avg is: " + avg);
  
  System.out.println("The result of sum is: " + sum);
  double base = readNum();
  double height = readNum();
  double area = 0.5*base*height;
  System.out.print("The area of the triangle is: "+ area);
}
public static void call() {
  System.out.println("welcome to out calculaor ");
  
}
}
