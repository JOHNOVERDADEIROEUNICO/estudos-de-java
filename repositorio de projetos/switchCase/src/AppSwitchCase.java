import java.util.Scanner;

public class AppSwitchCase {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um número de 1 à 7: ");
        var numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.printf("Você digitou o número %s, mais %s ponto", numero, numero);
                break;
            case 2:
                System.out.printf("Você digitou o número %s, mais %s pontos", numero, numero);
                break;    
            case 3:
                System.out.printf("Você digitou o número %s, mais %s pontos", numero, numero);
                break;
            case 4:
                System.out.printf("Você digitou o número %s, mais %s pontos", numero, numero);
                break;
            case 5:
                System.out.printf("Você digitou o número %s, mais %s pontos", numero, numero);
                break;
            case 6:
                System.out.printf("Você digitou o número %s, mais %s pontos", numero, numero);
                break;
            case 7:
                System.out.printf("Você digitou o número %s, mais %s pontos", numero, numero);
                break;

            /*case 8 -> System.out.printf("Você digitou o número %s, mais %s pontos", numero, numero); 
                case 9, 10 -> System.out.printf("Você digitou o número %s, mais %s pontos", numero, numero); 
            OBS: você deve escolher uma sintaxe para usar, ambas juntas não funcionam.*/

            default:
                System.out.println("você digitou um número fora do gap.");
                break;
        }

    }
}
