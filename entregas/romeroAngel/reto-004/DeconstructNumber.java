import java.util.Scanner;

public class DeconstructNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número de 3 digitos:");
        int firstNumber = scanner.nextInt();
        System.out.println("Ingrese un segundo número de 3 digitos:");
        int secondNumber = scanner.nextInt();
        System.out.println("Ingrese un tercer número de 3 digitos:");
        int thirdNumber = scanner.nextInt();
        
        int hundreds;
        int tens;
        int ones;
        int deconstructedNumber;

        System.out.println("Número 1: " + firstNumber);
        System.out.println("Número 2: " + secondNumber);
        System.out.println("Número 3: " + thirdNumber);

        hundreds = firstNumber/100;
        tens = (secondNumber/10)%10;
        ones = thirdNumber%10;

        deconstructedNumber = hundreds*100 + tens*10 + ones;

        System.out.print(deconstructedNumber);

    }
}