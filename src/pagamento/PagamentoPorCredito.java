package pagamento;

import java.util.Scanner;

public class PagamentoPorCredito implements Pagamento {

    private Scanner leitorStatus = new Scanner(System.in);

    @Override
    public void pagar(double valor) {
        boolean pagamentoConcluido = false;
        
        System.out.println("Pagamento via Cartão de Crédito selecionado.");
        System.out.println("Insira o cartão e digite a senha para pagar R$" + valor);
        do {
            System.out.println("Digite 'true' se o pagamento foi realizado ou 'false' caso contrário:");
            if (leitorStatus.hasNextBoolean()) {
                pagamentoConcluido = leitorStatus.nextBoolean();
                if (!pagamentoConcluido) {
                    System.out.println("Pagamento não realizado. Por favor, tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite 'true' ou 'false'.");
            }
        } while (!pagamentoConcluido);

        System.out.println("Pagamento realizado com sucesso!");
    }
}
