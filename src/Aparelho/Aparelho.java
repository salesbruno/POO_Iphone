package Aparelho;

import Calling.AparelhoTelefonico;
import Internet.NavegadorInternet;
import Music.ReprodutorMusical;

public class Aparelho implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    public void ligar() {
        System.out.println("Fazendo ligaçao");
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarConversa() {
        System.out.println("Inicianado conversa");
    }

    public void exibirPagina() {
        System.out.println("Exibindo a página");
    }

    public void adiicionarAba() {
        System.out.println("Adicionando aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
