public class App {
    public static void main(String[] args) throws Exception {
        var value1 = 10;
        var binary1 = Integer.toBinaryString(value1);

        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);

        var value2 = 25;
        var binary2 = Integer.toBinaryString(value2);

        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value2, binary2);

        System.out.printf("%s | %s = %s\n", value1, value2, value1|value2);

        /*
        Esta operação funciona da seguinte forma:

        0 = false
        1 = true

        O simbolo | é o simbolo de operação para OR (Sem curto-circuito) ou para operações bit a bit, oobviamnete neste contexto é para operações bit a bit.

        Ele vaai analisar ambos os números em binario e vai comparar, onde:

        se 1 e 1 = 1
        se 0 e 1 ou 1 e 0 = 1
        e se 0 e 0 = 0

        Assim gerando um novo número atravez de comparação binaria.
        */

        System.out.printf("%s & %s = %s\n", value1, value2, value1 & value2);

        /*
        Diferente do |, o & (AND) retorna 1 se e somente se ambos forem 1
        */

        System.out.printf("%s ^ %s = %s\n", value1, value2, value1 ^ value2);

        /*
        ^ também chamado de XOR ou OR exclusivo retornar 1 apenas quando os bianrios são diferentes exemplo: 0 e 1 ou 1 e 0
        */

        System.out.printf("%s = ~%s\n", value1, ~value1);

        /*
        ~ Esse é o NOT binário, também chamado de complemento, e sua função é inverter os valores ou seja o que é 0 vira 1 e o que é 1 vira 0.
        */

        System.out.printf("%s = <<%s\n", value1, value1 << 1);

        /*
        Chamado de shift pra esquerda, desloca os bits para a esquerda, é equivalente a multiplicação, aquele numero 1 = 2, 2 = 4...
        */

         System.out.printf("%s = >>%s\n", value1, value1 >> 1);       
         
         /*
         Chamado de shift para a direita com sinal, faz o inverso do shift pra esquerda, ou seja desloca pra direita e é equivalente a divisão, numero 1 = 2 ou seja divide por 2(Aproximadamente). Além disso ele mantém o sinal
         */

          System.out.printf("%s = >>>%s\n", value1, value1 >>> 1);

          /*
          Chamado de shift pra direita sem sinal, faz o mesmo que o descrito acima, mas não preserva sinal
          */
    }
}
