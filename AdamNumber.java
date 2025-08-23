import java.util.Scanner;
public class AdamNumber{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sqr = n*n;
        int rev =0;
        while(n>0){
            int digit = n%10;
             rev = rev*10+digit;
            n= n/10;
        }
        
        int sq_rev = rev*rev;
        int rev1 =0;
        while(sq_rev>0){
            int v = sq_rev%10;
             rev1 = rev1*10+v;
            sq_rev = sq_rev/10;
        }
        if(sqr == rev1){
            System.out.println("ADAM");
        }
        else{
            System.out.println("NOT ADAM");
        }
       sc.close();
    }

}