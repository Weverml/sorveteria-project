package Cardapio;

public class Cardapio {
    private String saboresSorvete[] = { "Morango", "Baunilha", "Chocolate", "Flocos", "Jaca", "Abacaxi", "Creme" };
    private String calda[] = { "Morango", "Chocolate", "Menta" };
    private String adicionaisAcai[] = { "Leite em pó", "Leite condensado", "Granola", "Banana" };
    private String adicionaisExtra[] = { "Nutella", "Granulado", "Kitkat", "Amendoim" };
    private String adicionaisFruta[] = { "Morango", "Banana", "Kiwi" };
    private String recipienteSorteve[] = { "Casquinha", "Copo", "Cascão" };
    private String recipienteAcai[] = { "Tigela", "Copo- 200ml", "Copo- 500ml" };
    private String saboresAcai[] = { "Tradicional", "Com Banana", "Com Morango", "Com Kiwi", "Com Abacaxi",
            "Com Maracujá" };

    public String[] getSaboresSorvete() {
        return saboresSorvete;
    }

    public String[] getCalda() {
        return calda;
    }

    public String[] getAdicionaisAcai() {
        return adicionaisAcai;
    }

    public String[] getAdicionaisExtra() {
        return adicionaisExtra;
    }

    public String[] getAdicionaisFruta() {
        return adicionaisFruta;
    }

    public String[] getRecipienteSorteve() {
        return recipienteSorteve;
    }

    public String[] getRecipienteAcai() {
        return recipienteAcai;
    }

    public String[] getSaboresAcai() {
        return saboresAcai;
    }

    public void ImprimirCardapio() {

        System.out.println("\n\n===========================================================");
        System.out.println("                        CARDAPIO!                      ");
        System.out.println("===========================================================\n");

        System.out.println("\n************************************************************");
        System.out.println("                           SORVETE!                         ");
        System.out.println("************************************************************\n");

        System.out.println("- SABORES:  \n");

        for (int i = 0; i < saboresSorvete.length; i++) {
            System.out.println("- " + saboresSorvete[i]);

        }

        System.out.println("\n- VEM COM UM ADICIONAL DE CALDA! ");

        System.out.println("\n- SABORES DA CALDA: \n");
        for (int i = 0; i < calda.length; i++) {
            System.out.println("- " + calda[i]);

        }

        System.out.println("\n- BOLA DE SORVETE:                         PREÇO:\n");
        System.out.println("- Unidade...............................: R$ 1,50");

        System.out.println("\n************************************************************");
        System.out.println("                            AÇAÍ!                          ");
        System.out.println("************************************************************\n");

        System.out.println("- SABORES: \n ");

        for (int i = 0; i < saboresAcai.length; i++) {
            System.out.println("- " + saboresAcai[i]);

        }

        System.out.println("\n- JÁ VEM INCLUSO OS ADICIONAIS: \n");
        for (int i = 0; i < adicionaisAcai.length; i++) {
            System.out.println("- " + adicionaisAcai[i]);
        }

        System.out.println("\n************************************************************");
        System.out.println("                      TIPOS DE RECIPIENTE!                    ");
        System.out.println("************************************************************\n");

        System.out.println("- RECIPIENTE DO SORVETE:                       PREÇO:\n");
        System.out.println("- Casquinha...................................: R$ 0,50");
        System.out.println("- Cascão......................................: R$ 1,00");
        System.out.println("- Copo........................................: R$ 0,00");

        System.out.println("\n- RECIPIENTE DO AÇAÍ:                       PREÇO:\n");
        System.out.println("- Copo 200ml.............................: R$  3,50");
        System.out.println("- Copo 500ml.............................: R$  7,00");
        System.out.println("- Tigela.................................: R$  10,00");

        System.out.println("\n************************************************************");
        System.out.println("                      ADICIONAIS A PARTE!                   ");
        System.out.println("************************************************************\n");

        System.out.println("ADICIONAIS EXTRA:\n");

        for (int i = 0; i < adicionaisExtra.length; i++) {
            System.out.println("- " + adicionaisExtra[i]);
        }
        System.out.println("\n FRUTAS: \n");

        for (int i = 0; i < adicionaisFruta.length; i++) {
            System.out.println("- " + adicionaisFruta[i]);

        }
        System.out.println("\nPERMITIDO APENAS DOIS ADICIONAIS POR COPO!\n");
        System.out.println("COMBO:\n");
        System.out.println("Dois adicionais frutas......: R$ 5,00 ");
        System.out.println("Dois adicionais extras......: R$ 3,00 ");
        System.out.println("Um adicional extra e o outro fruta......: R$ 4,00 \n");

    }
}
