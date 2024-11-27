public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected double saldo;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.saldo = 0.0; // Saldo inicial
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarSaldo(double valor) {
        this.saldo += valor;
    }

    // Método abstrato para ações específicas de cada tipo de usuário
    public abstract void realizarAcoes();
}