package Vizualizacao;

import javax.swing.JOptionPane;

import EntradaSaida.*;

public class InfoConta {
	
	Conta conta = new Conta();

	public void exibirExtratoDeSaques() {
		
	}
	public void exibirExtratoDeDepositos() {	
		conta.getListaDeMovimentacao();
	
	
	
	}
	public void exibirExtratoCompleto() {
		
	}
	public void exibirDadosDaConta() {
		
	}
	public void exibirSaldoCompleto(int saldo) {
		JOptionPane.showConfirmDialog(null, saldo,"Esse é o saldo da sua conta",JOptionPane.OK_CANCEL_OPTION);
	}
	public void solicitarInformacoesSaque() {
		
	}
	

}
