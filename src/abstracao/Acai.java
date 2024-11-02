package abstracao;

import java.util.Scanner;

import Cardapio.Cardapio;
import adicionais.Adicionais;
import produto.ProdutoGelado;

public abstract class Acai extends ProdutoGelado{
    public Scanner leitor = new Scanner(System.in);
	public Scanner leitorInt = new Scanner(System.in);

	private boolean temAdicionais = false;
	private Adicionais adicionaisAcai;

	public Acai() {
	
	}

	public Acai(int recipiente, double preco, String sabores[], Cardapio opcoes, Adicionais adicionaisAcai) {
		super(recipiente, preco, sabores, opcoes);
		this.adicionaisAcai= adicionaisAcai;
	}
	
	public boolean getTemAdicionais() {
		return temAdicionais;
	}
	public Adicionais getAdicionaisAcai() {
		return adicionaisAcai;
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
	public void lerSabores() {
		sabor = new String[1];
		System.out.println("\n\n=================================================");
		System.out.println("          Escolha os sabores do Acai: ");
		System.out.println("=================================================\n");
		int escolha = 0;
		for(int i=0; i< opcoes.getSaboresAcai().length; i++) {
			System.out.print( "\n" + (i+1) + "- " + opcoes.getSaboresAcai()[i]);
		}System.out.print("\n\n\n");
		for(int i=0; i<sabor.length; i++) {
			do {
				System.out.print("- Sabor: ");
				escolha= leitorInt.nextInt();
				
				switch(escolha) {
				case 1:
					sabor[i] = opcoes.getSaboresAcai()[0];
					break;
				case 2:
					sabor[i] = opcoes.getSaboresAcai()[1];
					break;
				case 3:
					sabor[i] = opcoes.getSaboresAcai()[2];
					break;
				case 4:
					sabor[i] = opcoes.getSaboresAcai()[3];
					break;
				case 5:
					sabor[i] = opcoes.getSaboresAcai()[4];
					break;
				case 6:
					sabor[i] = opcoes.getSaboresAcai()[5];
					break;
				default:
				System.out.print("Opção inválida!\n");
				break;
				}
		     }while(escolha < 1 || escolha > 6);
		}
	}
	
	public void lerAdicionais() {
			adicionaisAcai = new Adicionais();
			temAdicionais = adicionaisAcai.lerAdicionais();
			preco += adicionaisAcai.getPreco();
			System.out.println("\n\n Preco: " + preco);
	}

  
}
