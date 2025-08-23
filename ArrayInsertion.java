import java.util.Scanner;
public class ArrayInsertion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int num = sc.nextInt();

        // create array with +1 size for insertion
        int arr[] = new int[num + 1];

        System.out.println("Enter the elements of array:");
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position to insert the element (0-based index):");
        int position = sc.nextInt();

        System.out.println("Enter the element to be inserted: ");
        int element = sc.nextInt();

        // shift elements to the right
        for(int i = num; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        // place the new element
        arr[position] = element;

        System.out.println("Array after insertion:");
        for(int i = 0; i <= num; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
