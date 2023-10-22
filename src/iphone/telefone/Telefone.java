package iphone.telefone;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar(Contato numero) {
        System.out.println("Realizando chamada para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz");
    }

}
