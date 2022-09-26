package lista01.ex06;

public class PersonIndividual extends Person {
    private String cpf;

    public PersonIndividual(String cpf) {
        this.cpf = cpf;
        System.out.println(this.isValid());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean isValid() {
        //!! CPF validator
        return false; 
    }

    @Override
    public String toString() {
        return toString() + String.format("\n{Individual}, CPF: %s", getCpf());
    }
}
