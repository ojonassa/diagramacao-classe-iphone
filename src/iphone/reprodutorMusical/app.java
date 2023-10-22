package iphone.reprodutorMusical;

public class app {
    public static void main(String[] args) {
        Reprodutor meuReprodutor = new Reprodutor();

        meuReprodutor.selecionarMusica("Música 1");

        meuReprodutor.tocar("Musica 1");

        meuReprodutor.pausar();
    }
}
