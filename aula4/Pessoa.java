public class Pessoa{
    private String nome;
    private int idade;
    private char sexo;


    public void fazerAniversario(){
        this.idade=idade+1;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public char getSexo() {
        return sexo;
    }
}