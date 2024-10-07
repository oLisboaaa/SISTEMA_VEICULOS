class Caminhao extends Veiculo{
    private int quantEixo;
    private float pesoB;
    
    public Caminhao(String modelo, int anoFab, String montadora, String cor, float km, int quantEixo, float pesoB){
        super(modelo, anoFab, montadora, cor, km);
        this.quantEixo = quantEixo;
        this.pesoB = pesoB;
    }
    
    public int getQuantEixo(){
        return quantEixo;
    }
    public void setQuantEixo(int quantEixo){
        this.quantEixo = quantEixo;
    }
    
    
    public float getPesoB(){
        return pesoB;
    }
    public void setPesoB(float pesoB){
        this.pesoB = pesoB;
    }
}