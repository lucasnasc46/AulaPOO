public class PenMetodos {
   public String modelo;
   private float ponta;

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
//depois testar com o metodo set na main
   public void status(){
    System.out.println("Caneta modelo: " + this.modelo + " - ponta " + this.ponta);
   }
}
