public class Controle implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //construtor para criar objeto com valores fixos
    public Controle(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    //metodos especiais - get e set
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado(){
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando(){
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //metodos especificos 
    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar(){
        this.setLigado(false);
    }

    @Override
    public void abrirMenu(){
        System.out.println("ligado :" + this.getLigado());
        System.out.println("tocando: " + this.getLigado());
        System.out.println("volume: " + this.getVolume());
    }

    @Override
    public void fecharMenu(){
        System.out.println("fechando o menu...");
    }

    @Override
    public void maisVolume(){
        if (this.getLigado()){
            this.setVolume(getVolume() + 1);
        }
        
    }

    @Override
    public void menosVolume(){
       if (this.getLigado()){
        this.setVolume(getVolume() - 1);
       }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        } 
        
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
        
    }

    @Override
    public void play() {
       if (this.getLigado() && this.getTocando()){
        this.setTocando(true);
       }
        
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        
    }
}