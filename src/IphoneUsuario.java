import iphone.Iphone;

public class IphoneUsuario {
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();
        
        meuIphone.iniciarCorreioVoz();
        meuIphone.ligar("200-199199");
        meuIphone.atender();

        meuIphone.exibirPagina("google.com");
        meuIphone.atualizarPagina();
        meuIphone.adicionarNovaAba();

        meuIphone.selecionarMusica("Castles Made of Sand");
        meuIphone.tocar();
        meuIphone.pausar();
    }
}
