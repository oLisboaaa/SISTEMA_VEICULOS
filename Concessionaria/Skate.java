class Skate extends Veiculo {
    private String marca;
    private String rodas;

    public Skate(String modelo, int anoFab, String montadora, String cor, float km, String marca, String rodas) {
        super(modelo, anoFab, montadora, cor, km);
        this.marca = marca;
        this.rodas = rodas;
    }


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getRodas() {
        return rodas;
    }
    public void setRodas(String rodas) {
        this.rodas = rodas;
    }
}
