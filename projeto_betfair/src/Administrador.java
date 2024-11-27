
public class Administrador extends Usuario {

    public Administrador(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public void bloquearConta(Jogador jogador) {
        System.out.println("Conta do jogador " + jogador.getNome() + " bloqueada.");
    }

    @Override
    public void realizarAcoes() {
        System.out.println("Administrador pode gerenciar contas e apostas.");
    }
}