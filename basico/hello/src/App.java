import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

       while(true){
            System.out.println("Informe um nome: [exit para sair]");
            var name = scanner.next();

            System.out.printf("Você digitou o nome : %s\n", name);

            if (name.equalsIgnoreCase("exit")) break;
       }
       /*O while é identico ao c#, além disso o do while também. */
    }
}
