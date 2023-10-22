package iphone.navegadorInternet;

public class Navegador implements NavegadorInternet {
    private String paginaAtual;

    @Override
    public void exibirPagina(String url) {
        if (url != null) {
            this.paginaAtual = url;
            System.out.println("Exibindo página: " + url);
        } else {
            System.out.println("URL inválida");
        }
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba adicionada: " + url);
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual != null) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página aberta");
        }
    }

}
