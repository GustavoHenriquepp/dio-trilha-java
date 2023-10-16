import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        /**
         * <h1>Desafio Controle de Fluxo</h1>
         * O projeto pede 2 parâmetros, caso o primeiro seja maior que o segundo, lança
         * uma exceção customizada. Caso contrario, o programa roda normalmente e
         * imprime o
         * resultado da subtração do parametroDois e do parametroUm em um loop usando o
         * for.
         * 
         * 
         * @author Gustavo Henrique
         * @version 1.0
         * @since 16/10/2023
         */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual seria o primeiro parametro ?");
        int parametroUm = scanner.nextInt();

        System.out.println("E qual seria o segundo parametro ?");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro !");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i <= contagem; i++) {
                System.out.println("Imprimindo o numero " + i);
            }
        }
    }
}
