import java.util.*;
public class frontSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern size");
              int n = sc.nextInt();
              for(int row=1;row<=n;row++){
                for(int col=1;col<=n-row;col++){
                    System.out.println(" ");
                }
                for(int col=1;col<=row;col++){
                    System.out.println("* ");

                }
              }
   }
}