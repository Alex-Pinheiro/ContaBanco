import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int i = 0;
        System.out.println("Digite o número da conta");
        Scanner numConta = new Scanner(System.in);
        int mNumConta = numConta.nextInt();

        System.out.println("Digite o seu nome");
        Scanner nome = new Scanner(System.in);
        String mNome = nome.nextLine();

        System.out.println("Digite o nome da agência");
        Scanner nomeAgencia = new Scanner(System.in);
        String mnNmeAgencia = nomeAgencia.nextLine();

        System.out.println("Digite o saldo");
        Scanner saldo = new Scanner(System.in);
        BigDecimal mSaldo = saldo.nextBigDecimal ();
        System.out.println("Olá "+mNome +", obrigado por criar uma conta em nosso banco, sua agência é "+mnNmeAgencia+", conta "+mNumConta +" e seu saldo "+mSaldo+" já está disponível para saque.");

    }

}
