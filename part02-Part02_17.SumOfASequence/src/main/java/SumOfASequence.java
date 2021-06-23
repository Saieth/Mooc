
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int input = Integer.valueOf(scanner.nextLine());
        int i = 0;
        int sum = 0;
        
        while (i < input){
            i++;
            sum = sum + i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
