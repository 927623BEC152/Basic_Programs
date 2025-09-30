import java.util.Scanner;
public class clockRotate {
    public static void main(String[] args){

	 Scanner sc=new Scanner(System.in);

	 System.out.println("Enter the Length of Array");

	 int len=sc.nextInt();

	 int[] arr=new int[len];

	 for(int i=0;i<len;i++){

	     arr[i]=sc.nextInt();

	 }

	 

	  System.out.println("Enter the Times to Rotation of Array");

	  int rotate=sc.nextInt();

	  rotate =rotate%len;

	  for(int j=1;j<=rotate;j++){

	 // step 1

	 int last_Index=arr[len-1];

	 // step 2

	 for(int i=len-2;i>=0;i--){

	   arr[i+1]=arr[i];

	 }

	 // step 3

	 arr[0]=last_Index;

}

	 for(int i=0;i<len;i++){

	    System.out.print(arr[i]+" ");

	 }
sc.close();
  }

}
    