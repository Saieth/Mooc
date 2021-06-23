
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int input = 0;
        int sum = 0;
        int i = 0;
        int odd = 0;
        int even = 0;
        
        while (true){
            input = Integer.valueOf(scanner.nextLine());
            
            if (input < 0){
                System.out.println("Thx! Bye!");
                break;
            }
            
            if (input % 2 == 0){
                even++;
            } else if (input % 2 != 0){
                odd++;
            }
            
            i++;
            sum = sum + input;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + i);
        System.out.println("Average: " + ((double)sum / i));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
