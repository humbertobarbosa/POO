package lista01.ex08;

import java.util.ArrayList;

public class Aluno implements Validacao {
    private String nomeCompleto, matricula;
    private ArrayList<Nota> notas;
    
    public Aluno(String nomeCompleto, String matricula, ArrayList<Nota> notas) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.notas = notas;

        if (!this.validar()) {
            System.out.println("Aluno inválido!");
            System.exit(1);
        } else { 
            String notasObtidas = "";
            for (Nota n: getNotas()) {
                notasObtidas += n.toString();
            }
            System.out.println("Matrícula: " + getMatricula());
            System.out.println("Nome: " + getNomeCompleto());
            System.out.println("Notas obtidas:\n" + notasObtidas);
            System.out.printf("Nota semestral: %.2f\n", getNotaSemestral());
            System.out.printf("Nota final: %.2f\n", getNotaFinal());
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public boolean validarNome() {
        if (getNomeCompleto().split(" ").length >= 2 && getNomeCompleto().length() < 50) {
            return true;
        }
        return false;
    }
    
    public boolean validarMatricula() {
        if (getMatricula().startsWith("201") && getMatricula().length() == 8) {
            return true;
        }
        return false;
    }

    public boolean validarNotas() {
        if (getNotas().size() == 5) {
            return true;
        }
        return false;
    }

    @Override
    public boolean validar() {
        if (this.validarNome() && this.validarMatricula() && this.validarNotas()) {
            return true;
        }
        return false;
    }

    public void removerMenorNota() {
        if (getNotas().size() == 5) {
            int indice = 0;
            for (int i = 0; i < getNotas().size(); i++) {
                if (getNotas().get(i).getValor() < getNotas().get(1).getValor())
                    indice = i;
            }
            getNotas().remove(indice);
        }
    }

    public double getNotaSemestral() {
        removerMenorNota();
        double total = 0;
        for (Nota n: getNotas()) {
            total += n.getValor();
        }
        return total / 4;
    }

    public double getNotaFinal() {
        double notaFinal = 0, notaSemestral = getNotaSemestral();
        if (notaSemestral < 6) {
            notaFinal = notaSemestral * 0.75;
        } else if (notaSemestral >= 6 && notaSemestral < 7) {
            notaFinal = 7;
        } else if (notaSemestral >= 7 && notaSemestral <= 8) {
            notaFinal = notaSemestral * 1.15;
        } else {
            notaFinal = 10;
        }
        return notaFinal;
    }
}
