import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /**
         * <h1>Conta Bancaria</h1>
         * O projeto simula uma conta bancaria, cujo dados são passados atraves do
         * terminal.
         * 
         * 
         * @author Gustavo Henrique
         * @version 1.0
         * @since 04/10/2023
         */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bom dia ! Para a criação de sua conta no nosso banco, primeiro precisamos de alguns dados.");

        System.out.println("Qual é o seu nome ?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Qual o numero da agencia ? (ex: 067-8)");
        String agencia = scanner.next();

        System.out.println("Qual o numero da sua conta ? (ex: 1021)");
        int numeroConta = scanner.nextInt();

        System.out.println("E por ultimo, qual seu saldo ?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque.");

    }
}
