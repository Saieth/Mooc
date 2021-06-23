
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;
        
        while(true){
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input > 0){
                numbers++;
                sum = sum + input;
            }
            
            if (input == 0){
                if (sum > 0){
                    System.out.println("Average of the numbers: " + ((double)sum / numbers));
                } else if (sum <= 0){
                    System.out.println("Cannot calculate the average");
                }
                break;
            }
        }
        
        
    }
}
