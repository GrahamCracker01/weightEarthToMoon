import java.util.Scanner; //imports scanner class
public class main {
    public static void main(String[] args) {
        //declare variables and scanner
        double earth;
        double moon;
        Scanner scan = new Scanner(System.in);

        //get input
        System.out.print("Enter your weight on Earth in pounds: ");
        earth = scan.nextDouble();

        //math
        moon = ((earth / 9.81) * 1.622);

        System.out.print("Your weight on the moon is " + moon + " pounds.");


    }
}
