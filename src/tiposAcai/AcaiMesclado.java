package tiposAcai;

import java.util.Scanner;

import Cardapio.Cardapio;
import abstracao.Acai;
import adicionais.Adicionais;

public class AcaiMesclado extends Acai {

  private boolean temAdicionais = false;

  public AcaiMesclado() {

  }

  public AcaiMesclado(int recipiente, double preco, String sabores[], Cardapio opcoes, Adicionais adicional) {
    super(recipiente, preco, sabores, opcoes, adicional);

  }

  public Scanner leitor = new Scanner(System.in);
  public Scanner leitorInt = new Scanner(System.in);

  public void lerRecipiente() {
    opcoes = new Cardapio();
    System.out.println("\n\nEscolha o tipo de recipiente: ");
    for (int i = 0; i < opcoes.getRecipienteAcai().length; i++) {
      System.out.print("\n" + (i + 1) + "- " + opcoes.getRecipienteAcai()[i]);
    }
    System.out.print(":  ");
    recipiente = leitorInt.nextInt();
    if (recipiente == 1) {
      preco = 10;
    } else if (recipiente == 2) {
      preco = 3.50;
    } else if (recipiente == 3) {
      preco = 7;
    }
  }

  public void lerSabores() {
		sabor = new String[1];
		System.out.println("\n\n=================================================");
		System.out.println("          Escolha os sabores do Acai: ");
		System.out.println("=================================================\n");
		int escolha = 0;
		for(int i=0; i< opcoes.getAcaiMesclado().length; i++) {
			System.out.print( "\n" + (i+1) + "- " + opcoes.getAcaiMesclado()[i]);
		}System.out.print("\n\n\n");
		for(int i=0; i<sabor.length; i++) {
			do {
				System.out.print("- Sabor: ");
				escolha= leitorInt.nextInt();
				
				switch(escolha) {
				case 1:
					sabor[i] = opcoes.getAcaiMesclado()[0];
					break;
				case 2:
					sabor[i] = opcoes.getAcaiMesclado()[1];
					break;
				case 3:
					sabor[i] = opcoes.getAcaiMesclado()[2];
					break;
				case 4:
					sabor[i] = opcoes.getAcaiMesclado()[3];
					break;
				case 5:
					sabor[i] = opcoes.getAcaiMesclado()[4];
					break;
				default:
				System.out.print("Opção inválida!\n");
				break;
				}
		  }
      while(escolha < 1 || escolha > 5);
		}
	}

  public void lerAdicionais() {
    adicional = new Adicionais();
    temAdicionais = adicional.lerAdicionais();
    preco += adicional.getPreco();
    System.out.println("\n\n Preco: " + preco);
  }
}
