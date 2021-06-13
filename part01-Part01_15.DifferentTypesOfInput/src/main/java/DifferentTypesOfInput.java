
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String sinput = scan.nextLine();
        
        System.out.println("Give an integer:");
        int iinput = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double dinput = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean binput = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + sinput);
        System.out.println("You gave the integer " + iinput);
        System.out.println("You gave the double " + dinput);
        System.out.println("You gave the boolean " + binput);
    }
}
