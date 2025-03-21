public class PemConstrutor {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public PemConstrutor(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
}

public String getModelo(){
 return this.modelo;
}

public void setModelo (String m){
 this.modelo = m;
}

public float getPonta(){
 return this.ponta;
}
public void setPonta(float p){
 this.ponta = p;
}

public void tampar(){
    this.tampada=true;
}
}