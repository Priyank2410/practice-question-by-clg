import java.util.Scanner;
public class SumOfFirstNaturalNumber {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Random Nmmber - ");
        int num = sc.nextInt();

        if(num<=0){
            System.out.println("pls check teh number you entered and Enter the Number Grater then Zero");
        }else{
            int sum = num*(num+1)/2;
            System.out.println("your Answer is "+sum);
        }

    }
}
