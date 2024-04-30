import java.util.Scanner;



public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.printf("Digite o primeiro parâmetro: ");
        int parametroUm = Integer.parseInt(terminal.nextLine());
        System.out.printf("Digite o segundo parâmetro: ");
        int parametroDois = Integer.parseInt(terminal.nextLine());
        terminal.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("===============================================================");
            System.out.println("UM DOS PARÂMETROS NÃO CORRESPONDEM COM A LÓGICA DE NEGÓCIO");
            System.out.println("===============================================================");
        }

    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            System.out.println("============================");

            for (int i = 1; i < contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
            System.out.println("============================");
        }
    }
}




