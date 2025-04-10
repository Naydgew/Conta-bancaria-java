import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o nome do CLiente: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o sobrenome: ");
        String sobrenome = scanner.next();

        double saldo = 237.48;


        System.out.println("Olá " + nomeCliente + " " + sobrenome + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e o seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
