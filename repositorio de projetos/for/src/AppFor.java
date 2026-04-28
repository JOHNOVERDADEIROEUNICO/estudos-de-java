import java.util.Scanner;

public class AppFor {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        for( ; ; ){
            System.out.println("Digite um nome: ");
            var nome = scanner.next();

            if (nome.equalsIgnoreCase("exit")) break;/*O equalsIgnoreCase funciona igual o equals comun com a diferença que ele ignora se as letras estão maiúsculas ou minúsculas */

            System.out.println(nome);

            /*Perceba que nosso for não tem parametros de configuração, sim é possível usar o for desta forma em java, por mais que não seja o certo e basicamente ele vai se comportar como um while true ou seja, vai ser infinito até que a condição break seja acionada. Aqui no caso ela é acionada quando digitamos exit*/
        }
        for(var i = 1 ; i <=10; i++){
            if(i % 2 == 0)
                System.out.println(i);
            else
                System.out.println("ímpar");
        }

    }
}
