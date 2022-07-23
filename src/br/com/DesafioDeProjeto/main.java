package br.com.DesafioDeProjeto;

public class main {
	public static void main(String[] args) {
		Cliente kaio = new Cliente();
		kaio.setNome("Kaio");
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.Depositar(100);
		cc.Transferir(100, cp);
		
		cc.imprimirInformacoesComuns();
		cp.imprimirInformacoesComuns();
	}
}
