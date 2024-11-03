package abstracao;

import Cardapio.Cardapio;
import adicionais.Adicionais;
import produto.ProdutoGelado;

public abstract class Sorvete extends ProdutoGelado {
	
	protected int quantBolas;
	protected String calda;
	protected Adicionais adicional;
	
	public Sorvete() {
		
	}
    public Sorvete(int recipiente, double preco, String sabor[], Cardapio opcoes, int quantBolas,  String calda, Adicionais adicional ) {
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

	public String getCalda() {
		return calda;
	}

	public abstract void lerRecipiente();

	public abstract void lerSabores(int quantBola);

	public abstract void lerCalda(); 

}
