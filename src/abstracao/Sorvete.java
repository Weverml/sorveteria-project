package abstracao;

import Cardapio.Cardapio;
import produto.ProdutoGelado;

public abstract class Sorvete extends ProdutoGelado {
	
	private int quantBolas;
	private String calda;
	
	
	public Sorvete() {
		
	}
    public Sorvete(int recipiente, double preco, String sabor[], Cardapio opcoes, int quantBolas,  String calda ) {
    	super(recipiente, preco, sabor, opcoes);
    	this.quantBolas = quantBolas;
    	this.calda = calda;
		
	}
	public int getQuantBolas() {
		return quantBolas;
	}
	public void setQuantBolas(int quantBolas) {
		this.quantBolas = quantBolas;
	}

	public String getCalda() {
		return calda;
	}

	public abstract void lerRecipiente();

	public abstract void lerSabores(int quantBola);

	public abstract void lerCalda(); 

}
