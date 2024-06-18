package servicos;

public interface ReprodutorMusical {
    public void tocar();
    public void pausar();
    public abstract void selecionarMusica(String musica);
}
