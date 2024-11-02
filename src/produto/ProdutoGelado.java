package produto;

import java.util.Scanner;

import Cardapio.Cardapio;

public class ProdutoGelado {
    public static Scanner leitor = new Scanner(System.in);
	public static Scanner leitorInt = new Scanner(System.in);
	
	protected double preco;
	protected int recipiente;
	protected String sabor[];
	protected Cardapio opcoes;
	
	public int getRecipiente() {
		return recipiente;
	}
	public void setRecipiente(int recipiente) {
		this.recipiente = recipiente;
	}
	public ProdutoGelado(){
		
	}
	public ProdutoGelado(int recipiente, double preco,  String[] sabores, Cardapio opcoes){
		super();
		this.recipiente = recipiente;
		this.preco = preco;
		this.sabor = sabores;
		this.opcoes = opcoes;
	}
	
	public void lerRecipiete() {
		System.out.println("\n\n==================================");
		System.out.println("          Informe o recipiente!       ");
		System.out.println("====================================\n");
			 recipiente = leitor.nextInt();
			 preco = 0;
	}
	public void lerSabores() {
		System.out.println("Escolha o sabor: ");
		for(int i=0; i< opcoes.getSaboresSorvete().length; i++) {
			System.out.println("- "+ opcoes.getSaboresSorvete()[i]);
			sabor[i] = leitor.nextLine();
	    }
	}

    
}
