import java.util.Scanner;
public class VowelsAndConsonant{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cheractor = ");
        char word = sc.next().charAt(0);

        if(word=='a'||word=='e'||word=='i'||word=='o'||word=='u'){
            System.out.println(word+" is a Vowels");
        }
        else{
            System.out.println(word+" is a consonant");
        }
    }
}    