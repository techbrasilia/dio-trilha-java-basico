import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero = 0;
        String agencia = null;
        String nome = null;
        double saldo = 3459638.55;

        Scanner msg = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da sua agência: ");
        agencia = msg.next();
        System.out.println("Digite um numero para conta: ");
        numero = msg.nextInt();
        System.out.println("Para finalizar, digite seu nome: ");
        nome = msg.next();
        System.out.println("Ola "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}