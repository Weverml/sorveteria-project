package tiposAcai;

import Cardapio.Cardapio;
import abstracao.Acai;
import adicionais.Adicionais;

public class AcaiTradicional extends Acai {
  
  private boolean temAdicionais = false;

  public AcaiTradicional() {
	
	}
	public AcaiTradicional(int recipiente, double preco, String sabores[], Cardapio opcoes,Adicionais adicional ) {
		super(recipiente, preco, sabores, opcoes,adicional);
	
	}
  
  public void lerRecipiente() {
		opcoes = new Cardapio();
		System.out.println("\n\nEscolha o tipo de recipiente: ");
		for(int i=0; i< opcoes.getRecipienteAcai().length; i++) {
			System.out.print( "\n" + (i+1) + "- " + opcoes.getRecipienteAcai()[i]);
		}
		System.out.print( ":  " );
		recipiente = leitorInt.nextInt();
		if(recipiente == 1) {
			preco = 10;
		}
		else if(recipiente == 2) {
			preco = 3.50;
		}
		else if(recipiente == 3) {
			preco = 7;
		}
	}
	
	public void lerAdicionais() {
    adicional = new Adicionais();
    temAdicionais = adicional.lerAdicionais();
    preco += adicional.getPreco();
    System.out.println("\n\n Preco: " + preco);
  }
}
