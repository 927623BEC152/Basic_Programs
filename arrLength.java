
 import java.util.*;
 public  class arrLength  {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6,7,8,4,9};
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
       
        System.out.println(count);
    }
}

