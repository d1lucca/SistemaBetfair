public class Jogador extends Usuario {

    public Jogador(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    // Método para realizar uma aposta
    public void apostar(Aposta aposta) {
        if (saldo >= aposta.getValor()) {
            saldo -= aposta.getValor();
            System.out.println("Aposta realizada: " + aposta.getTipo());
        } else {
            System.out.println("Saldo insuficiente para apostar!");
        }
    }

    @Override
    public void realizarAcoes() {
        System.out.println("Jogador pode realizar apostas.");
    }
}