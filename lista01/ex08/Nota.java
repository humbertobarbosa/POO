package lista01.ex08;

public class Nota implements Validacao {
    private double valor;
    private String assunto;
    
    public Nota(double valor, String assunto) {
        this.valor = valor;
        this.assunto = assunto;

        if (!this.validar()) {
            System.out.println("Nota inválida!");
            System.exit(1);
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public boolean validarValor() {
        if (getValor() >= 0 && getValor() <= 10) {
            return true;
        }
        return false;
    }

    public boolean validarAssunto() {
        if (getAssunto().length() != 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean validar() {
        if (this.validarValor() && this.validarAssunto()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%.2f | %s\n", getValor(), getAssunto());
    }
}
