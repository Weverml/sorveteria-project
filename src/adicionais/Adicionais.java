package adicionais;

import java.util.Scanner;

import Cardapio.Cardapio;

public class Adicionais {
    public static Scanner leitor = new Scanner(System.in);
    public static Scanner leitorInt = new Scanner(System.in);
	
	private Cardapio cardapio = new Cardapio();
	private String[] escolha = new String[2];
    private double preco = 0;
    
    public Cardapio getCardapio() {
		return cardapio;
	}
    
	public double getPreco() {
		return preco;
	}
	
	public String[] getEscolha() {
		return escolha;
	}
	
	public boolean lerAdicionais(){
		System.out.println("\n===================================================");
		System.out.println("          Escolha a opção de adicionais!");
		System.out.println("===================================================\n");
		System.out.print("0- Nenhum adicionais;\n1- Para dois adicionais extra;\n2- Para dois adicionais frutas;\n3- Para um adicional extra e o outro fruta: ");
		int op = leitorInt.nextInt();
		if(op==1){
			System.out.println("\n===================================================");
			System.out.println("               Escolha os adicionais!");
			System.out.println("===================================================\n");

			int operador=0;
			System.out.println("\n1- Nutella; 2- Granulado; 3- Kitkat; 4- Amendoim: \n");
			
			for(int i=0; i<escolha.length; i++) {
				do {
					System.out.print((i+1) +"° Adicional: ");
				    operador = leitorInt.nextInt();
				    switch(operador) {
			        case 1:
			        	escolha[i] = cardapio.getAdicionaisExtra()[0];
				        break;
			        case 2:
				        escolha[i] = cardapio.getAdicionaisExtra()[1];
				        break;
			        case 3:
				        escolha[i] = cardapio.getAdicionaisExtra()[2];
				        break;
			        case 4:
				        escolha[i] = cardapio.getAdicionaisExtra()[3];
				        break;
			        default:
				        System.out.println("Valor invalido!!!");
			        }
				}while(operador < 1 || operador > 4);
		    }   
			preco=3;
		}
		else if(op==2){
			System.out.println("\n===================================================");
			System.out.println("              Escolha os adicionais!");
			System.out.println("===================================================\n");
			
			int escolhaAdicionais = 0;
			System.out.println("\n1- Morango; 2- Banana; 3- Kiwi: \n");
			
			for(int i=0; i< escolha.length; i++){
				do {
					System.out.print((i+1) +"° Adicional: ");
				    escolhaAdicionais=leitorInt.nextInt();
				    switch(escolhaAdicionais) {
					case 1:
						escolha[i] = cardapio.getAdicionaisFruta()[0];
						break;
					case 2:
						escolha[i] = cardapio.getAdicionaisFruta()[1];
						break;
					case 3:
						escolha[i] = cardapio.getAdicionaisFruta()[2];
						break;
					default:
						System.out.print("Opção inválida!");
						break;
				    }
				}while(escolhaAdicionais < 1 || escolhaAdicionais > 3);
			}
			preco = 5;
		}
		else if(op==3){
			System.out.println("\n===================================================");
			System.out.println("             Escolha os adicionais!");
			System.out.println("===================================================\n");
			int operador = 0;
			System.out.println("\nUm adicional extra:                 Um adicional fruta: ");
			System.out.println("1- Nutella                          5- Morango ");
			System.out.println("2- Granulado                        6- Banana ");
			System.out.println("3- Kitkat                           7- Kiwi ");
			System.out.println("4- Amendoim: \n");
			for(int i=0; i< escolha.length; i++) {
				do {
					System.out.print((i+1) +"° Adicional: ");
					operador = leitorInt.nextInt();
					switch(operador) {
					case 1:
						escolha[i] = cardapio.getAdicionaisExtra()[0];
						break;
					case 2:
						escolha[i] = cardapio.getAdicionaisExtra()[1];
						break;
					case 3:
						escolha[i] = cardapio.getAdicionaisExtra()[2];
						break;
					case 4:
						escolha[i] = cardapio.getAdicionaisExtra()[3];
						break;
					case 5:
						escolha[i] = cardapio.getAdicionaisFruta()[0];
						break;
					case 6:
						escolha[i] = cardapio.getAdicionaisFruta()[1];
					    break;
					case 7:
						escolha[i] = cardapio.getAdicionaisFruta()[2];
						break;
					default:
						System.out.println("Valor invalido!!!");
						break;
					}
				}while(operador < 1 || operador > 7);
			}
			preco = 4;
		}
		else if(op==0){
			preco = 0;
			return false;
		}
		else{
			System.out.println("\nOpção inválida!");
		}
		return true;
	}
	public void mostrarAdicionais() {
		for(int i= 0; i<2; i++) {
			System.out.println( "  "+ escolha[i]);
		}
	}

    
}
