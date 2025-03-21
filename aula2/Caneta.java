public class Caneta{
    
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("caneta: " + this.cor);
        System.out.println("com a ponta" + this.ponta);
        System.out.println("esta tampada? " + this.tampada);
    }

    void rabiscar (){
        if(this.tampada == true){
            System.out.println("ERRO, caneta tampada");
        }else{
            System.out.println("rabisco");
        }
    }

    void tampar(){
        this.tampada=true;
    }
    
    void destampar(){
        this.tampada=false;
    }
}
