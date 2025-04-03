public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("bolsa renovada!");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + "bolsista, pagamento com " + this.bolsa + "de desconto");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

}
