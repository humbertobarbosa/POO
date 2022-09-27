package lista01.ex10;

public class Envio {
    private ListaFuncionarios listaFuncionarios;

    public Envio(ListaFuncionarios listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public ListaFuncionarios getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(ListaFuncionarios listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void enviar(Email email) {
        int indiceOrigem = this.listaFuncionarios.funcionarios.indexOf(email.getUsuarioOrigem());
        int indiceDestino = this.listaFuncionarios.funcionarios.indexOf(email.getUsuarioDestino());

        this.listaFuncionarios.funcionarios.get(indiceOrigem).enviarEmail(email);
        this.listaFuncionarios.funcionarios.get(indiceDestino).receberEmail(email);
    }
}
