package iphone.reprodutorMusical;

public class app {
    public static void main(String[] args) {
        Reprodutor meuReprodutor = new Reprodutor();

        Musica minhaMusica = new Musica("Musica 1", "Artista 1");

        meuReprodutor.selecionarMusica(minhaMusica);

        meuReprodutor.tocar(minhaMusica);

        meuReprodutor.pausar();
    }
}
