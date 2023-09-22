package banco;

import java.util.Scanner;

public class PerfilContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria cliente1 = new ContaBancaria();
		Scanner recebeInfo = new Scanner(System.in);
		Scanner recebetxt = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao banco DIO. Crie a sua conta conosco.");
		System.out.println("Responda as perguntas e ao finalizar sua conta será criada");
		
		System.out.println("");
		
		System.out.println("Informe o número da conta:");
		cliente1.conta = recebeInfo.nextInt();
		
		System.out.println("Informe o número da agência: ");
		cliente1.agencia = recebeInfo.nextInt();
		
		System.out.println("Informe seu nome: ");
		cliente1.nome = recebetxt.nextLine();
		
		System.out.println("Informe seu saldo ");
		cliente1.saldo = recebeInfo.nextInt();
		
		System.out.println(cliente1.nome + ", " + "Obrigado por criar uma conta em nosso banco, sua agência e:");
		System.out.println("Agência: " + cliente1.agencia );
		System.out.println("Conta: " + cliente1.conta );
		System.out.println("Saldo: " + cliente1.saldo );
	}

}
