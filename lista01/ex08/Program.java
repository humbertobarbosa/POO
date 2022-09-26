package lista01.ex08;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Nota> notas = new ArrayList<>();

        notas.add(new Nota(10, "Introdução à POO"));
        notas.add(new Nota(9, "Abstração"));
        notas.add(new Nota(6, "Encapsulamento"));
        notas.add(new Nota(8, "Herança"));
        notas.add(new Nota(5, "Polimorfismo"));
        
        new Aluno("Humberto Barbosa", "20101234", notas);
    }
}
