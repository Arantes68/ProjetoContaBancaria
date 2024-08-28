package projetoContaBanco;

import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {

		
	  Scanner sc = new Scanner(System.in);
	  ContaTerminal ct = new ContaTerminal(3500);
	  Pessoa p = new Pessoa();
	  
	  System.out.println("========== BANCO DO BRASIL ==========");
	  
	  System.out.println();
	  System.out.println();
	  
	  System.out.print("Digite o número da conta: ");
	  ct.numero = sc.nextInt();
	  
	  sc.nextLine();
	// Consome a nova linha deixada pelo nextInt()
	  
	  System.out.println();
	  System.out.println();
	  
	  System.out.print("Nome completo: ");
	  p.nomeCliente = sc.nextLine();
	  
	  System.out.println();
	  System.out.println();
	  
	  System.out.print("Digite o número da Agência: ");
	  ct.agencia = sc.nextInt();
	  
	  sc.nextLine();
	// Consome a nova linha deixada pelo nextInt()
	  
	  System.out.println();
	  System.out.println();
	  
	  System.out.println("Olá, "+ p.nomeCliente + "! Obrigado por criar uma conta em nosso banco,"
	  		+ " sua agência é: "+ ct.agencia +", conta: " + ct.numero + " e seu saldo: "+ ct.saldo
	  				+ " já está disponível para saque");
	  
	  sc.close();
	}
}
