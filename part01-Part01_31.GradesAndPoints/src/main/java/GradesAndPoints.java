
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scan.nextLine());
        
        if (points < 0 ){
            System.out.println("impossible!");
        } else if (points <= 49){
            System.out.println("failed");
        } else if (points <= 99){
            points = points / 10 - 4;
            System.out.println(points);
        } else if (points == 100) {
            System.out.println("5");
        } else if (points > 100){
            System.out.println("incredible");
        }
    }
}
