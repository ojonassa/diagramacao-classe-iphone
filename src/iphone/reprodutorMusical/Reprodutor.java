package iphone.reprodutorMusical;

public class Reprodutor implements ReprodutorMusical {
    private Musica musicaAtual;

    @Override
    public void tocar(Musica musica) {
        if (musicaAtual != null) {
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada");
        }
    }

    @Override
    public void pausar() {
        if (musicaAtual != null) {
            System.out.println("Pausando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada");
        }
    }

    @Override
    public void selecionarMusica(Musica musica) {
        this.musicaAtual = musica;
        System.out.println("Selecionando música: " + musica);
    }
}
