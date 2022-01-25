import java.util.Scanner;

public class Lab2_qn2 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        double number2 = input.nextDouble();
        Scanner input3 = new Scanner(System.in);
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
        input.close();
        input2.close();
        input3.close();
    }
}
