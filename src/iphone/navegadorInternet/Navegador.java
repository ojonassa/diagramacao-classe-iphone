package iphone.navegadorInternet;

public class Navegador implements NavegadorInternet {
    private Pagina paginaAtual;

    @Override
    public void exibirPagina(Pagina pagina) {
        if (pagina != null) {
            this.paginaAtual = pagina;
            System.out.println("Exibindo página: " + pagina);
        } else {
            System.out.println("URL inválida");
        }
    }

    @Override
    public void adicionarNovaAba(Pagina pagina) {
        System.out.println("Nova aba adicionada: " + pagina);
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
