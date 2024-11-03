package abstracao;

import Cardapio.Cardapio;
import adicionais.Adicionais;
import produto.ProdutoGelado;

public abstract class Acai extends ProdutoGelado{
   
	protected Adicionais adicional;
	
	public Acai() {
	
	}
	public Acai(int recipiente, double preco, String sabores[], Cardapio opcoes,Adicionais adicional ) {
		super(recipiente, preco, sabores, opcoes);
		this.adicional= adicional;
	}
	

	public abstract void lerRecipiente();
	
	public abstract void lerSabores(); 

	public abstract void lerAdicionais(); 


}
