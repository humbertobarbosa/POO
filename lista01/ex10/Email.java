package lista01.ex10;

import java.util.Date;

public class Email {
    private String mensagem, titulo;
    private Funcionario usuarioOrigem, usuarioDestino;
    private Date dataEnvio;
    
    public Email(String mensagem, Funcionario usuarioOrigem, Funcionario usuarioDestino, String titulo, Date dataEnvio) {
        this.mensagem = mensagem;
        this.usuarioOrigem = usuarioOrigem;
        this.usuarioDestino = usuarioDestino;
        this.titulo = titulo;
        this.dataEnvio = dataEnvio;

        if (!this.validarMensagem()) {
            System.exit(1);
        }
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Funcionario getUsuarioOrigem() {
        return usuarioOrigem;
    }

    public void setUsuarioOrigem(Funcionario usuarioOrigem) {
        this.usuarioOrigem = usuarioOrigem;
    }

    public Funcionario getUsuarioDestino() {
        return usuarioDestino;
    }

    public void setUsuarioDestino(Funcionario usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public boolean validarMensagem() {
        if (getMensagem().length() <= 2500) {
            return true;
        }
        System.out.println("Mensagem inválida!");
        return false;
    }
}
