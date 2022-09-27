package lista01.ex10;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        ListaFuncionarios listaFuncionarios = new ListaFuncionarios();
        Envio envio = new Envio(listaFuncionarios);

        Funcionario funcionario = new Funcionario("Humberto", "Desenvolvedor", "123456", "humbertob.tavares@gmail.com");
        Funcionario random = new Funcionario("Random", "Random", "000001", "random@outlook.com");
        listaFuncionarios.cadastrarFuncionario(funcionario);
        listaFuncionarios.cadastrarFuncionario(random);

        Email email = new Email("Bem-vindo, Humberto!", random, funcionario, "Mensagem de boas-vindas", new Date());
        envio.enviar(email);

        for (Funcionario f: listaFuncionarios.funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Matrícula: " + f.getMatricula());
            System.out.println("Cargo: " + f.getCargo());

            System.out.println("E-mails enviados:");
            for (Email e: f.getEmailsEnviados()) {
                System.out.println(e.getTitulo());
            }

            System.out.println("E-mails recebidos:");
            for (Email r: f.getEmailsRecebidos()) {
                System.out.println(r.getTitulo());
            }

            System.out.println();
        }
    }
}
