//heranca para diferença recebe os atributos da superclasse e tem seus proprios 

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }

    public void pagarMensalidade(){
        System.out.println("mensalidade paga!");
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }
}
