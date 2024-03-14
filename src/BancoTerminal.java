import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Por favor, digite a conta: ");
            int conta = reader.nextInt();
            
            System.out.println("Agora digite a agencia: ");
            String agencia = reader.next();
            
            System.out.println("Digite seu nome:");
            String nome = reader.next();

            System.out.println("Qual o seu saldo? ");
            BigDecimal saldo = reader.nextBigDecimal();

            String message = MessageFormat.format("Olá {0}, obrigado por criar uma conta em nosso banco, sua agencia é {1}, conta {2} e seu saldo é {3} já está disponível para saque", nome, agencia, conta, saldo);

            System.out.println(message);
        }
    }
}
