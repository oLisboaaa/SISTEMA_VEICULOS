class Motoclicleta extends Veiculo{
    private int cc;
    private int torque;
    
    public Motoclicleta(String modelo, int anoFab, String montadora, String cor, float km, int cc, int torque){
        super(modelo, anoFab, montadora, cor, km);
        this.cc = cc;
        this.torque = torque;
    }
    
    public int getCc(){
        return cc;
    }
    public void setCc(int cc){
        this.cc = cc;
    }
    
    
    public int torque(){
        return torque;
    }
    public void torque(int torque){
        this.torque = torque;
    }
}