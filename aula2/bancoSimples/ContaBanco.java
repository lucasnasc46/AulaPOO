package bancoSimples;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    public void abrirConta (String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if (t.equals("CC")){
            this.setSaldo(50f);
        }
        else if (t.equals("CP")){
            this.setSaldo(150f);
        } 
        else{
            System.out.println("ERRO, tipo de conta invalida!");
        }
        System.out.println("CONTA ABERTA");
        }

    public void fecharConta(){
        if (this.saldo > 0 ){
            System.out.println("ERRO, conta com saudo!");
        }
        else if (this.saldo < 0 ){
            System.out.println("ERRO, conta em débito");
        }
        else{
            this.setStatus(false);
        }
    }

    public void depositar(float valor){
        if (this.status = true){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Deposito efetuado");
        }
        else{
            System.out.println("ERRO, Conta inexistente!");
        }
    }

    public void sacar(float valor){
        if (this.status = true){
            if(this.saldo > valor){
                this.setSaldo(this.getSaldo()-valor);
                System.out.println("Saque efetuado");
            }
            else{
                System.out.println("ERRO, saldo insuficiente!");
            }
        }
        else{
            System.out.println("Conta inexistente");
        }
    }

    public void pagarMesalidade(){
        if (this.tipo == "CC"){
            if(this.saldo >=20){
                this.setSaldo(this.getSaldo()-20);
            }
        }
    }

    public void estatusConta(){
        System.out.println("----------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Nome: " + getDono());
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Saldo: " + getSaldo());
    }
    }

