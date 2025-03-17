import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = myScanner.nextLine();

        System.out.println("Digite a sua agência: ");
        int agencia = myScanner.nextInt();

        System.out.println("Digite o número da sua conta: ");
        int numeroDaConta = myScanner.nextInt();

        System.out.println("Digite o número do Saldo: ");
        double SaldoDaConta = myScanner.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua\nagência é %d, conta %d e seu saldo R$: %.2f já está disponível para saque \n", nome, agencia, numeroDaConta, SaldoDaConta  );


    }
}
