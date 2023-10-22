import iphone.navegadorInternet.Navegador;
import iphone.navegadorInternet.Pagina;
import iphone.reprodutorMusical.Musica;
import iphone.reprodutorMusical.Reprodutor;
import iphone.telefone.Contato;
import iphone.telefone.Telefone;

public class App {
    public static void main(String[] args) throws Exception {
        Telefone meuTelefone = new Telefone();
        Contato meuContato = new Contato("Jonas", "63992261215");
        meuTelefone.ligar(meuContato);
        meuTelefone.atender();
        meuTelefone.iniciarCorreioVoz();

        Reprodutor meuReprodutor = new Reprodutor();
        Musica minhaMusica = new Musica("Musica 1", "Artista 1");
        meuReprodutor.selecionarMusica(minhaMusica);
        meuReprodutor.tocar(minhaMusica);
        meuReprodutor.pausar();

        Navegador meuNavegador = new Navegador();
        Pagina minhaPagina = new Pagina("https://www.exemplo.com");
        meuNavegador.exibirPagina(minhaPagina);
        meuNavegador.adicionarNovaAba(minhaPagina);
        meuNavegador.atualizarPagina();
    }
}
