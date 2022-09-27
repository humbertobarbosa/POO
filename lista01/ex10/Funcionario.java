package lista01.ex10;

import java.util.ArrayList;

public class Funcionario {
    private String nome, cargo, matricula, email;
    private ArrayList<Email> emailsEnviados;
    private ArrayList<Email> emailsRecebidos;
    
    public Funcionario(String nome, String cargo, String matricula, String email) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.email = email;
        this.emailsEnviados = new ArrayList<>();
        this.emailsRecebidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Email> getEmailsEnviados() {
        return emailsEnviados;
    }

    public void setEmailsEnviados(ArrayList<Email> emailsEnviados) {
        this.emailsEnviados = emailsEnviados;
    }

    public ArrayList<Email> getEmailsRecebidos() {
        return emailsRecebidos;
    }

    public void setEmailsRecebidos(ArrayList<Email> emailsRecebidos) {
        this.emailsRecebidos = emailsRecebidos;
    }

    public void enviarEmail(Email email) {
        this.emailsEnviados.add(email);
        setEmailsEnviados(this.emailsEnviados);
    }

    public void receberEmail(Email email) {
        this.emailsRecebidos.add(email);
        setEmailsRecebidos(this.emailsRecebidos);
    }
}
