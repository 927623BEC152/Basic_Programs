import java.util.*;
 public class Pyramid3 {
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern size");
              int n = sc.nextInt();
              for(int row=1;row<n;row++){
                for(int col=1;col<=n-row;col++){
                    System.out.print(" ");
                }
                for(int col=1;col<=2*row-1;col++){
                    System.out.print("1");

                }
                System.out.println();
            } 
            for(int row=n;row>=1;row--)
            {
                for(int col=1;col<=n-row;col++){
                    System.out.print(" ");
                }
                for(int col=1;col<=2*row-1;col++){
                    System.out.print("1");

                }
                System.out.println();
            } 
     sc.close();          
   }

}
