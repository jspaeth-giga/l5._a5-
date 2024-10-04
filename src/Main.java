import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne;
        int numberTwo;

        System.out.println("please enter two numbers");
        numberOne = scan.nextInt();
        numberTwo = scan.nextInt();

        if (numberOne > numberTwo) {
            System.out.println(numberOne + " is bigger than " + numberTwo);
        }
        else if (numberTwo > numberOne) {
            System.out.println(numberTwo + " is bigger than " + numberOne);
        } else {
            System.out.println("You have entered invalid integers");
        }
    }
}