public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Professor pr1 = new Professor();
        Funcionario f1 = new Funcionario();

        p1.setNome("Jose");
        a1.setNome("Vandilma");
        pr1.setNome("lucas");
        f1.setNome("Ana");

        pr1.aumento(5000f);

        System.out.println(pr1.getNome());
    }
}
