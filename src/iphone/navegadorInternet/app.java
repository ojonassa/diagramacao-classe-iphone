package iphone.navegadorInternet;

public class app {
    public static void main(String[] args) {
        Navegador meuNavegador = new Navegador();

        
        meuNavegador.exibirPagina("https://www.exemplo.com");

        
        meuNavegador.adicionarNovaAba("https://www.novaaba.com");

        meuNavegador.atualizarPagina();
    }
}
