import java.util.*;

public class LangleTry {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the rows: "); 
       int n = input.nextInt();

       for(int i=n; i>=1; i--){
          for(int j=1; j<i; j++){
             System.out.print(" ");
         }
            //  if((i+j)<=n){
                    // System.out.print(" ");    
            // }else{
            //     System.out.print("+");
            // }
           for(int k=0; k<=n-i; k++){
              System.out.print("+");
        }
         System.out.println();
}

}
}