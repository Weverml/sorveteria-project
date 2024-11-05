package pagamento;

import java.util.Scanner;

public class PagamentoDinheiro implements Pagamento {

    public Scanner leitorInt = new Scanner(System.in);

    @Override
    public void pagar(double valor) {
        double dinheiro;
        System.out.println("Pagamento em Dinheiro selecionado.");
        System.out.println("Por favor, entregue R$" + valor + " ao caixa.");
        do{
            System.out.print("\n\nDigite a quantia: ");
            dinheiro = leitorInt.nextDouble();
            if(dinheiro < valor) {
                System.out.print("\nDinheiro insuficiente!");
            }
        }
        while(dinheiro < valor);
        if(dinheiro > valor) {
            System.out.print("\nSeu troco é " + (dinheiro - valor));
            System.out.print("\n\nPagamento realizado com sucesso!\n");
        }
        else if(dinheiro == valor) {
            System.out.print("\n\nPagamento realizado com sucesso!\n");
        }
    }
}
