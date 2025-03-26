package Luta;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String m, String n, float p, int v, int d, int e){
        this.nome=m;
        this.nacionalidade=n;
        this.setPeso(p);
        this.vitorias=v;
        this.derrotas=d;
        this.empates=e;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public float getPeso() {
        return peso;
    }
    private void setCategoria() {
        if(this.getPeso() < 52){
            this.categoria="invalido";
        }
        else if(this.getPeso() <= 70.3){
            this.categoria="Leve";
        }
        else if(this.getPeso() <=83.9){
            this.categoria="medio";
        }
        else if(this.getPeso() <=120){
            this.categoria="pesado";
        }
        else{
            this.categoria="invalido";
        }
    }
    public String getCategoria() {
        return categoria;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getEmpates() {
        return empates;
    }
    
    //metodos especificos 
    public void apresentar(){
        System.out.println("nome: " + getNome());
        System.out.println("Nacionalidade: " +getNacionalidade());
        System.out.println("peso: " + getPeso());
        System.out.println("vitorias: " + getVitorias());
        System.out.println("empates: " + getEmpates());
        System.out.println("derrotas: "+ getDerrotas());
      
    }
     public void status(){
        System.out.println("nome: " + getNome());
        System.out.println("categoria: " + getCategoria());
        System.out.println("vitorias: " + getVitorias());
        System.out.println("empates: " + getEmpates());
        System.out.println("derrotas: "+ getDerrotas());
     
     }

     public void ganharLuta(){
        this.setVitorias(getVitorias()+1);
     }

     public void perderLutar(){
        this.setDerrotas(getDerrotas()+1);
     }

     public void empatarLutar(){
        this.setEmpates(getEmpates()+1);
     }
}
