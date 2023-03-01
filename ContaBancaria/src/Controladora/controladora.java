package Controladora;

import EntradaSaida.*;
import Vizualizacao.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class controladora {

	public void exibeMenu() {
		Conta conta = new Conta();
		InfoConta infoConta = new InfoConta();
		int opcao = 0;
		int opcaoInicial = 0;
		do {
			opcaoInicial = conta.opcoesIniciais();
			switch (opcaoInicial) {
			case 1:
				conta.setTitularDaConta(conta.gerarDadosDaConta(null));// verificar dentro do gerar se dados não está
																		// vazio
				break;
			}
			do {
				opcao = conta.opcaoesPrincipais();
				switch (opcao) {
				case 1:// saldo
					conta.gerarSaldo();
					conta.setSaldo();
					infoConta.exibirSaldoCompleto(conta.getSaldo());
					break;
				case 2:// saque
					conta.sacar();
					break;
				case 3:// deposito
					conta.depositar();
					break;
				case 4:// extratos
					int opcoesExtratos = conta.opcoesExtratos();
					do {
						switch (opcoesExtratos) {
						case 1:// extratos de saques
							conta.gerarExtratoSaques();
							infoConta.exibirExtradoDeSaques();
							break;
						case 2:// extrato de depositos
							conta.gerarExtratoDepositos();
							infoConta.exibirExtratoDeDepositos();
							break;
						case 3:// extrato completo
							conta.gerarExtrato();
							infoConta.exibirExtratoCompleto();
							break;
						}
					} while (opcoesExtratos != 4);
					break;
				case 5:// informações da conta
					break;
				case 6:// sair da conta
					conta.setTitularDaConta(conta.zerandoConta());
					opcao = 7;
					break;
				}
			} while (opcao != 7);
		} while (opcaoInicial != 2);
	}

}
