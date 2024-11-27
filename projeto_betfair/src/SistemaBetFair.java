
public class SistemaBetFair {
    public static void main(String[] args) {
        // Cadastro de jogadores
        Jogador jogador = new Jogador("Lucas", "lucas@email.com", "1234");
        Administrador admin = new Administrador("Admin", "admin@betfair.com", "admin");

        // Conta bancária
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(500.0);
        jogador.adicionarSaldo(500.0);

        // Realizar aposta
        Aposta aposta = new Aposta("Esportiva", 100.0);
        jogador.apostar(aposta);
        aposta.finalizarAposta(true); // Jogador ganha a aposta

        // Gerenciamento pelo administrador
        admin.bloquearConta(jogador);
    }
}