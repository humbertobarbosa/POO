package lista01.ex06;

public class PersonLegal extends Person {
    private String cnpj;

    public PersonLegal(String cnpj) {
        this.cnpj = cnpj;
        System.out.println(this.isValid());
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean isValid() {
        //TODO CNPJ validator
        return false;
    }
    
    @Override
    public String toString() {
        return toString() + String.format("\n{Legal}, CNPJ: %s", getCnpj());
    }
}
