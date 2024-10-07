class Domestico extends Veiculo{
    private int quantMax;
    private String tipFreio;
    private int airbag;
    
    public Domestico(String modelo, int anoFab, String montadora, String cor, float km, int quantMax, String tipFreio, int airbag){
        super(modelo, anoFab, montadora, cor, km);
        this.quantMax = quantMax;
        this.tipFreio = tipFreio;
        this.airbag = airbag;
        }
        
    public int getQuantMax(){
        return quantMax;
    }
    public void setQuantMax(int quantMax){
        this.quantMax = quantMax;
    }
    
    public String getTipFreio(){
        return tipFreio;
    }
    public void setTipFreio(String tipFreio){
        this.tipFreio = tipFreio;
    }
    
    public int getAirbag(){
        return airbag;
    }
    public void setAirbag(int airbag){
        this.airbag = airbag;
    }
}