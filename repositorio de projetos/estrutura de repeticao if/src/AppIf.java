import java.util.Scanner;

public class AppIf {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        var nome = scanner.next();

        System.out.println("Informe sua idade: ");
        var idade = scanner.nextInt();

        System.out.println("Você possui alguma deficiência? [s/n]");
        var deficiente = scanner.next();

       /*  if (idade >= 18) System.out.printf("%s tem %s anos, você pode dirigir", nome, idade);*/
       if("n".equals(deficiente)){
            if (idade >= 18){ 
                System.out.printf("%s tem %s anos, você pode dirigir", nome, idade);
            }
            else{
                System.out.printf("%s tem %s anos, e é menor de idade, logo não pode dirigir", nome, idade);
            }
        } 
        else if("s".equals(deficiente)){
            System.out.printf("%s não está apto a dirigir devido a sua condição fisica.", nome);
        }

    }
}
