
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("---");
        printRectangle(17, 3);
        System.out.println("---");
        printTriangle(7);
        System.out.println("---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        char star = '*';
        String stars = "";
        
        for (int i = 0; i < number; i++){
            stars = stars + star;
        }
        System.out.println(stars);
    }

    public static void printSquare(int size) {
        // second part of the exercise
        char star = '*';
        String square = "";
        
        for (int i = 0; i < size; i++){
            square = square + star;
        }
        
        for (int i = 0; i < size; i++){
            System.out.println(square);
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        char star = '*';
        String rectangle = "";
        
        for (int i = 0; i < width; i++){
            rectangle = rectangle + star;
        }
        
        for (int i = 0; i < height; i++){
            System.out.println(rectangle);
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        char star = '*';
        String triangle = "";
        
        for (int i = 0; i < size; i++){
            triangle = triangle + star;
            System.out.println(triangle);
        }
        
    }
}
