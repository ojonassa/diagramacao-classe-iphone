package iphone.telefone;

public class app {
    public class Main {
        public static void main(String[] args) {
            Telefone meuTelefone = new Telefone();

            meuTelefone.ligar(123456789);

            meuTelefone.atender();

            meuTelefone.iniciarCorreioVoz();
        }
    }

}
