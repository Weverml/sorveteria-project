package abstracao;

import java.util.Scanner;

import Cardapio.Cardapio;
import adicionais.Adicionais;
import produto.ProdutoGelado;

public abstract class Sorvete extends ProdutoGelado {
   public static Scanner leitor = new Scanner(System.in);
	public static Scanner leitorInt = new Scanner(System.in);
	
	private int quantBolas;
	private String calda;
	private Adicionais adicional;
	private boolean temAdicionais = false;
	
	public Sorvete() {
		
	}
    public Sorvete(int recipiente, double preco, String sabor[], Cardapio opcoes, int quantBolas,  String calda, Adicionais adicional) {
    	super(recipiente, preco, sabor, opcoes);
    	this.quantBolas = quantBolas;
    	this.calda = calda;
		this.adicional = adicional;
	}
	public int getQuantBolas() {
		return quantBolas;
	}
	public void setQuantBolas(int quantBolas) {
		this.quantBolas = quantBolas;
	}

	public Adicionais getAdicional() {
		return adicional;
	}

	public boolean getTemAdicionais() {
		return temAdicionais;
	}

	public String getCalda() {
		return calda;
	}

	public void lerRecipiente() {
		opcoes = new Cardapio();
		System.out.println("Escolha o tipo de recipiente: ");
		for(int i=0; i< opcoes.getRecipienteSorteve().length; i++) {
			System.out.print( "\n" + (i+1) + "- " + opcoes.getRecipienteSorteve()[i]);
		}System.out.print( ":  " );
		recipiente = leitorInt.nextInt();
		if(recipiente == 1) {
			preco = 0.50;
		}else if(recipiente == 2) {
			preco = 0;
		}else if(recipiente == 3) {
			preco = 1;
		}
	}
	public void lerSabores(int quantBola) {
		sabor = new String[quantBola];
		preco += (quantBola * 1.50);
		System.out.println("\n\n=================================================");
		System.out.println("          Escolha os sabores do sorvete: ");
		System.out.println("=================================================\n");
		int escolha = 0;
		for(int i=0; i< opcoes.getSaboresSorvete().length; i++) {
			System.out.print( "\n" + (i+1) + "- " + opcoes.getSaboresSorvete()[i]);
		}System.out.print("\n\n\n");
		for(int i=0; i<sabor.length; i++) {
			do {
				System.out.print((i+1) +"° Sabor: ");
				escolha= leitorInt.nextInt();
				
				switch(escolha) {
				case 1:
					sabor[i] = opcoes.getSaboresSorvete()[0];
					break;
				case 2:
					sabor[i] = opcoes.getSaboresSorvete()[1];
					break;
				case 3:
					sabor[i] = opcoes.getSaboresSorvete()[2];
					break;
				case 4:
					sabor[i] = opcoes.getSaboresSorvete()[3];
					break;
				case 5:
					sabor[i] = opcoes.getSaboresSorvete()[4];
					break;
				case 6:
					sabor[i] = opcoes.getSaboresSorvete()[5];
					break;
				case 7:
					sabor[i] = opcoes.getSaboresSorvete()[6];
					break;
				default:
				System.out.print("Opção inválida!\n");
				break;
				}
		     }while(escolha < 1 || escolha > 7);
		}
  }
	public void lerCalda() {
		System.out.println("\n\n=================================================");
		System.out.println("             Agora escolha a calda:");
		System.out.println("=================================================\n");
	    int escolhaCalda = 0;
	    do {
		    System.out.print("\n1- Morango; 2- Chocolate; 3- Menta: ");
		    escolhaCalda=leitorInt.nextInt();
		    switch(escolhaCalda) {
			case 1:
				calda = opcoes.getCalda()[0];
				break;
			case 2:
				calda = opcoes.getCalda()[1];
				break;
			case 3:
				calda = opcoes.getCalda()[2];
				break;
			default:
				System.out.print("Opção inválida!");
				break;
		  }
		}while(escolhaCalda < 1 || escolhaCalda > 3);
	}
  
	public void lerAdicionais() {
		adicional = new Adicionais();
		temAdicionais = adicional.lerAdicionais();
		preco += adicional.getPreco();
		System.out.println("\n\n Preco: " + preco);
	}

}
