import java.util.Scanner;

public class AppOperadores {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        var value1 = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        var value2 = scanner.nextInt();

        //System.out.println(value1 + " + "+ value2 + " = " + (value1 + value2) );

        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);

        System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2);

        System.out.printf("%s * %s = %s\n", value1, value2, value1 * value2);

        System.out.printf("%s / %s = %s\n", value1, value2, value1 / value2);

        System.out.println("Informe o primeiro número:");
        var value3 = scanner.nextFloat();

        System.out.println("Informe o segundo número:");
        var value4 = scanner.nextFloat();

        //System.out.println(value1 + " + "+ value2 + " = " + (value1 + value2) );

        System.out.printf("%s + %s = %s\n", value3, value4, value3 + value4);

        System.out.printf("%s - %s = %s\n", value3, value4, value3 - value4);

        System.out.printf("%s * %s = %s\n", value3, value4, value3 * value4);

        System.out.printf("%s / %s = %s\n", value3, value4, value3 / value4);

        System.out.printf("%s %% %s = %s\n", value3, value4, value3 % value4);//divisão inteira

        System.out.printf("A raiz quadrada de %s é: %s\n", value3, Math.sqrt(value3));//raiz quadrada, sempre retorna double.

         System.out.printf("%s elevado a 2 é: %s\n", value3, Math.pow(value3, 2));
    }
}
