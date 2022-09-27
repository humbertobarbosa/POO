package lista01.ex10;

import java.util.ArrayList;

public class ListaFuncionarios {
    ArrayList<Funcionario> funcionarios;

    public ListaFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
        setFuncionarios(this.funcionarios);
    }
}
