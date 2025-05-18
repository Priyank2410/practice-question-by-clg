import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value = ");
        int num = sc.nextInt();

        int first = 0;
        int second = 1;

        for(int i=1 ; i<=num ; i++){
            System.out.println(first+" ");

            int next = first+second;
            first = second;
            second  = next;
        }
    }
}
