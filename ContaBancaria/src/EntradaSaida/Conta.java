package EntradaSaida;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Conta {
	Movimentacao  movi = new Movimentacao(); 
	
	private String[] titularDaConta;

	private int saldoContaPop;

	private int sladoContaCore;

	private int saldo;

//private ArrayList<Movimentacao>listaDeMovimentacao<movimentacao>;

	public String[] getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String[] titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public int getSaldoContaPop() {
		return saldoContaPop;
	}

	public void setSaldoContaPop(String saldoDaContaPop) {
		this.saldoContaPop = saldoContaPop;
	}

	public int getSaldoContaCore() {
		return sladoContaCore;
	}

	public void setSaldoContaCore(String saldoDaContaCore) {
		this.sladoContaCore = sladoContaCore;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int depositar() {

	}

	public int sacar() {

	}

	public int gerarSaldo() {

	}

	public String[] gerarDadosDaConta(String[] dados) {
		dados[1] = JOptionPane.showInputDialog(null, "Insira seu nome completo");
		dados[2] = JOptionPane.showInputDialog(null, "Insira seu CPF. Sem traços e ponto");
		dados[3] = JOptionPane.showInputDialog(null, "Insira a data de hoje confrome o modelo DD/MM");
		dados[3] = movi.setData();
		return dados;
	}

	public String[] zerandoConta() {
		String zero[] = null;
		return zero;
	}

	public String gerarExtrato() {

	}

	public String gerarExtratoDepositos() {

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
		String[] opcoes = {"Entrar em uma Conta","Sair"};
		JComboBox<String> menuInicial = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null,menuInicial,"O que deseja?",JOptionPane.OK_CANCEL_OPTION);
		return menuInicial.getSelectedIndex();
	}
	
	
	
}
