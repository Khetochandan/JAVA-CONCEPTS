import java.util.*;
public class QuadraticSol7 {

  public static double readNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the num: ");
    double num= sc.nextInt();
    return num; 
    
  }
  public static void main(String[] args) {
    double a = readNum();
    double b = readNum();
    double c = readNum();
    double dis = b*b - 4*a*c;

    if(dis>0){ // real and unequal root
      double root1 = (-b+ Math.sqrt(dis))/2*a;
      double root2 = (-b- Math.sqrt(dis))/2*a;

      System.out.println("The root1 is: " + root1);
      System.out.println("The root2 is: " + root2);
    }
    else if(dis==0){ // real and equal root
      double root = -b/2*a;
      System.out.println("The root is: " + root);

    }
    else{ // complex congugate root
     System.out.println("Complex root ");
    }
  }
}