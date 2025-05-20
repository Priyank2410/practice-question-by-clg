import java.util.Scanner;
public class SwipWithoutTemp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter a second number = ");
        int num2 = sc.nextInt();

        System.out.println("first number = "+num1+ " and second number = "+num2+ " before swiping");


        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("first number = "+num1+ " and second number = "+num2+ " after swiping");

    }
}
