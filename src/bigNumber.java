import java.math.BigInteger;
import java.util.Scanner;

public class bigNumber {
    public static void main(String[] args) {
//        SOLUTION I

//        BigInteger number1;
//        BigInteger number2;
//        BigInteger sum;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of number 1");
//        number1 = sc.nextBigInteger();
//        System.out.println("Enter the value of number 2");
//        number2 = sc.nextBigInteger();
//
//
//        BigInteger a = new BigInteger(""+number1);
//        BigInteger b = new BigInteger(""+number2);
//        BigInteger result = a.add(b);
//
//        System.out.println("Sum is Two numbers : -> " + result);

        Scanner input = new Scanner(System.in);
        System.out.println("Please put input Number1: ");
        String number1 = input.next();
        System.out.println("Please put input Number2: ");
        String number2 = input.next();

//        int x  = Integer.parseInt(number1);
//        int y  = Integer.parseInt(number2);

        Number number = new Number();
        number.addNumber(number1,number2);
//        System.out.println(number.addNumber(number1,number2));
    }
}
