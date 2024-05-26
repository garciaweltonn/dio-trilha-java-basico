import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        criarConta();
    }

    private static void criarConta() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência!");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        String numeroConta = scanner.next();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome!");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldoConta = scanner.nextDouble();

        exibirMensagem(nomeCliente, sobrenomeCliente, numeroAgencia, numeroConta, saldoConta);

    }

    private static void exibirMensagem(String nomeCliente, String sobrenomeCliente, String numeroAgencia,
                                      String numeroConta, double saldoConta) {

        String mensagem = String.format("Olá %s %s, obrigado por criar uma conta em nosso banco, " +
                        "sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque",
                nomeCliente, sobrenomeCliente, numeroAgencia, numeroConta, saldoConta);
        System.out.println(mensagem);
    }
}