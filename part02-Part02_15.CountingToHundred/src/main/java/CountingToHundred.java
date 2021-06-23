
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 100;
        int i = Integer.valueOf(scanner.nextLine());
        
        while ((input + 1) > i){
            System.out.println(i);
            i++;
        }
    }
}
