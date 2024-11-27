
public class Aposta {
    private String tipo;
    private double valor;
    private String status;

    public Aposta(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.status = "pendente";
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    // Método para finalizar aposta
    public void finalizarAposta(boolean ganhou) {
        if (ganhou) {
            status = "ganha";
            System.out.println("Aposta ganha!");
        } else {
            status = "perdida";
            System.out.println("Aposta perdida.");
        }
    }
}