package iphone;

import iphone.componentes.AparelhoTelefonico;
import iphone.componentes.NavegadorInternet;
import iphone.componentes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	@Override
	public void ligar() {
		System.out.println("Fazendo uma ligação...");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo uma ligação...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de voz...");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo uma pagina na internet...");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba...");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualiando pagina...");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a musica...");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando uma musica...");
		
	}

}
