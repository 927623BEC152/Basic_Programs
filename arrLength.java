
 import java.util.*;
 public  class arrLength  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt(); 
        int [] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         sc.close();

        int count =0;
        for(int i=0; ; i++){
            try 
            {
                int temp=arr[i];
            count++;
            }
            catch(ArrayIndexOutOfBoundsException e){
                break;
            }
            
        }
      System.out.println("Length of the array is:");
        System.out.println(count);
    }
}

