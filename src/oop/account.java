/**crie uma classe para representar uma conta corrente que possui um numero, um saldo,um status que informa se ela � especial ou n�o,um limite. 
Desenvolva m�todos para realizar saque(verificando se ele pode realizar saque), depositar dinheiro, consultar saldo e 
verificar se o cliente est� usando cheque especial ou n�o.*/

package oop;

public class account {

	String numero;
	String agencia;
	double saldo;
	boolean Especial;
	double especialUsado;
	double limiteEspecial;

	public boolean saque(double quantia) {
		if(saldo >=quantia ) {// tem saldo
			saldo-=quantia;
			return true;
		} else if (Especial){ // tem cheque Especial
			if(limiteEspecial >= especialUsado) {
				saldo -= especialUsado;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	
	public double deposito(double quantia) {
		double deposito = saldo+=quantia;
		return deposito;
	}
	
	void exibirSaldo() {
		System.out.println("Seu saldo � de : " + saldo);
	}
	
	void exibirChequeEspecial() {
		if(Especial) {
			System.out.println("POSSUI CHEQUE ESPECIAL");
		}else {
			System.out.println("N�O POSSUI CHEQUE ESPECIAL ");
		}
	}
	 

	public static void main(String[] args) {

		account acc = new account();

		acc.limiteEspecial = 500;
		acc.especialUsado = 10;
		acc.agencia = "3333";
		acc.numero = "310320";
		acc.saldo = 1000.00;
		acc.limiteEspecial = 4000.00;
		acc.Especial = true;
		acc.exibirSaldo();
		acc.saque(200);
		acc.exibirSaldo();
		acc.deposito(200);
		acc.exibirChequeEspecial();
	}

}
