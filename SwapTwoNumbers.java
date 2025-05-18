import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num A = ");
        int A = sc.nextInt();

        System.out.print("Enter a num B = ");
        int B = sc.nextInt();

         System.out.println("Before swaping num A =" +A+ " swaping num B ="+B);

        int temp = A;
        A = B;
        B = temp;

        System.out.println("After swaping num A =" +A+ " swaping num B ="+B);


    }
    
}
