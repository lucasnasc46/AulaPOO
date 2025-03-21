package bancoSimples;

public class Banco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();

        p1.setNumConta(0001);
        p1.setDono("Lucas");
        p1.abrirConta("CC");
        //testar os metodos

        p1.depositar(150f);
        p1.sacar(50);

        p1.estatusConta();

        ContaBanco p2 = new ContaBanco();

        p2.setNumConta(0002);
        p2.setDono("Maria");
        p2.abrirConta("CP");

        p2.estatusConta();
    }
    
}
