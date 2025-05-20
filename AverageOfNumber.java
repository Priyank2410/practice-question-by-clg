// import java.util.Scanner;
// public class AverageOfNumber {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);

//          System.out.print("Enter the first Number = ");
//         int num1 = sc.nextInt();
        
//         System.out.print("Enter the second Number = ");
//         int num2 = sc.nextInt();

//         System.out.print("Enter the third Number = ");
//         int num3 = sc.nextInt();

//         int sum = (num1+num2+num3) / 3;
//         System.out.println("the final answer is  = "+sum);
//     }
    
// }

import java.util.Scanner;
public class AverageOfNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to want to find Average of = ");
        int count = sc.nextInt();

        int sum = 0;

        for(int i=1 ; i<=count ; i++){
            System.out.print("Enter a number "+i+" = ");
            int num= sc.nextInt();
            sum+=num;
        }
        int average = sum/count;
        System.out.println("your Average  answers is = "+average);
    }
}