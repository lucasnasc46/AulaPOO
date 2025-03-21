public class MainMetodos {
    public static void main(String[] args) {
        
    
        PenMetodos c = new PenMetodos();

        c.setModelo("bic");
        c.setPonta(0.5f);
        //c.status();
       // System.out.println("caneta modelo " + c.getModelo() + " com ponta " + c.getPonta());

       PemConstrutor c2 = new PemConstrutor("Bic", "azul", 0.3f);
       System.out.println(c2.getModelo() + c2.getPonta());
}
}
