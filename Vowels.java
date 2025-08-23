
    import java.util.*;
public class  Vowels{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence:" );
        char ch=sc.next().charAt(0);
        if( ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='o'||ch=='O'||ch=='U'||ch=='u'){
            System.out.println("Vowel");
        }else
        if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'|ch=='5'|ch=='6'|ch=='7'||ch=='8'||ch=='9')
        {
            System.out.println("Numbers");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
    