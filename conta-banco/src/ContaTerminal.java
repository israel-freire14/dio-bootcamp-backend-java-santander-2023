import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal{
    public static void main(String[] args) {


        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuário
        //Obter pela classe Scanner os valores digitados noterminal
        //Exibir a mensagem conta criada

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        final int NUMERO_CONTA;
        final String NUMERO_AGENCIA;
        final String NOME_CLIENTE;
        double saldo;

        System.out.println("Por favor digite o número da conta: ");
            NUMERO_CONTA = Integer.parseInt(scan.nextLine());

        System.out.println("Por favor digite o número da agencia: ");
            NUMERO_AGENCIA = scan.nextLine();

        System.out.println("Por favor o nome do cliente: ");
            NOME_CLIENTE = scan.nextLine();

        System.out.println("Valor que deseja depositar:");
            saldo = Double.parseDouble(scan.nextLine());

        System.out.println("Olá "+ NOME_CLIENTE+ ", obrigado por criar uma conta em nosso banco, sua agência é "+NUMERO_AGENCIA+", conta "+NUMERO_CONTA+ " e seu saldo R$"+ saldo + " já está disponível para saque.");

        scan.close();
    }
}


