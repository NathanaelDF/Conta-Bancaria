package EntradaSaida;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Conta {
	Movimentacao movi = new Movimentacao();
	Conta conta = new Conta();

	private String[] titularDaConta;

	private int saldoContaPop;

	private int sladoContaCore;

	private int saldo;

	private ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();

	public ArrayList<Movimentacao> getListaDeMovimentacao() {
		return listaDeMovimentacao;
	}

	public void setListaDeMovimentacao(ArrayList<Movimentacao> listaDeMovimentacao) {
		this.listaDeMovimentacao = listaDeMovimentacao;
	}

	public String[] getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String[] titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public int getSaldoContaPop() {
		return saldoContaPop;
	}

	public void setSaldoContaPop(int saldoDaContaPop) {
		this.saldoContaPop = saldoContaPop;
	}

	public int getSaldoContaCore() {
		return sladoContaCore;
	}

	public void setSaldoContaCore(int saldoDaContaCore) {
		this.sladoContaCore = sladoContaCore;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void depositar(int qualConta) {
		int somaSaldo = 0;
		int deposito = 0;
		switch (qualConta) {
		case 1:// poupança
			deposito = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor do depósito ?"));
			movi.setDeposito(deposito);
//			movi.setConta(qualConta);
			listaDeMovimentacao.add(movi);
			somaSaldo = conta.getSaldoContaPop();
			somaSaldo += somaSaldo;
			setSaldoContaPop(somaSaldo);
			break;
		case 2:// corrente
			deposito = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor do depósito ?"));
			movi.setDeposito(deposito);
//			movi.setConta(qualConta);
			listaDeMovimentacao.add(movi);
			somaSaldo = conta.getSaldoContaCore();
			somaSaldo += somaSaldo;
			setSaldoContaCore(somaSaldo);
			break;
		}
	}

	public void sacar(int qualConta) {
		int saque = 0;
		int menosSaldo = 0;
		switch (qualConta) {
		case 1:// poupança
			saque = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto deseja sacar ?"));
			movi.setSaque(saque);
//			movi.setConta(qualConta);
			listaDeMovimentacao.add(movi);
			menosSaldo = conta.getSaldoContaPop();
			menosSaldo -= menosSaldo;
			setSaldoContaPop(menosSaldo);
			break;
		case 2:// corrente
			saque = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto deseja sacar ?"));
			movi.setSaque(saque);
//			movi.setConta(qualConta);
			listaDeMovimentacao.add(movi);
			menosSaldo = conta.getSaldoContaCore();
			menosSaldo -= menosSaldo;
			setSaldoContaCore(menosSaldo);
			break;
		}

	}

	public int gerarSaldo(int qualConta) {
		int saldo = 0;
		switch (qualConta) {
		case 1:// poupanca
			saldo = conta.getSaldoContaPop();
			break;
		case 2:// corrente
			saldo = conta.getSaldoContaCore();
			break;
		}
		return saldo;
	}

	public String[] gerarDadosDaConta(String[] dados) {
		dados[1] = JOptionPane.showInputDialog(null, "Insira seu nome completo");
		dados[2] = JOptionPane.showInputDialog(null, "Insira seu CPF. Sem traços e ponto");
		dados[3] = JOptionPane.showInputDialog(null, "Insira a data de hoje confrome o modelo DD/MM");
		movi.setData(dados[3]);
		return dados;
	}

	public String[] zerandoConta() {
		String zero[] = null;
		return zero;
	}

	public String gerarExtrato() {

	}

	public void gerarExtratoDepositos() {
		int size = listaDeMovimentacao.size();
		movi = listaDeMovimentacao.get(0);
		for (int i = 0; i < size; i++) {
		
		
		
		}
		
		
		
		
	}

	public String gerarExtratoSaques() {

	}

	public static int numRep() {
		int QtdeCarros = Integer.parseInt(JOptionPane.showInputDialog(""));
		return QtdeCarros;
	}

	public int opcaoesPrincipais() {
		String[] opcoes = { "Saldo", "Saque", "Deposito", "Extratos", "Informações da Conta", "Sair da Conta",
				"Sair do Programa" };
		JComboBox<String> menuPrincipal = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menuPrincipal, "Informe o que deseja fazer", JOptionPane.OK_CANCEL_OPTION);
		return menuPrincipal.getSelectedIndex();
	}

	public int opcoesExtratos() {
		String[] opcoes = { "Extrato de Saques", "Extratos de Depositos", "Extrato Completo ", "Sair desse menu" };
		JComboBox<String> menuExtrato = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menuExtrato, "Selecione o tipo de extrato que deseja",
				JOptionPane.OK_CANCEL_OPTION);
		return menuExtrato.getSelectedIndex();
	}

	public int opcoesIniciais() {
		String[] opcoes = { "Entrar em uma Conta", "Sair" };
		JComboBox<String> menuInicial = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menuInicial, "O que deseja?", JOptionPane.OK_CANCEL_OPTION);
		return menuInicial.getSelectedIndex();
	}

	public int qualConta() {
		int qualConta = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Qual conta deseja depositar\n1- Poupança\n2-Corrente"));
		return qualConta;
	}

}
