package iphone;

import servicos.AparelhoTelefonico;
import servicos.NavegadorInternet;
import servicos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    

   


    public void ligar(String numero) {
        System.out.println("Discando.. "+numero);
    }
    public void atender() {
        System.out.println("Chamada em operação..");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Mensagem em curso..");
    }

    public void tocar() {
        System.out.println("Tocando música..");
    }

    public void pausar() {
        System.out.println("Música pausada..");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionada a música: " + musica);
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");

    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }



}
