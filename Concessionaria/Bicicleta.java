class Bicicleta extends Veiculo{
    private String marca;
    private String material;
    private int quantMarchas;
    private String amortecedor;
    
    public Bicicleta(String modelo, int anoFab, String montadora, String cor, float km, String marca, String material, int quantMarchas, String amortecedor){
        super(modelo, anoFab, montadora, cor, km);
        this.marca = marca;
        this.material = material;
        this.quantMarchas = quantMarchas;
        this.amortecedor = amortecedor;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantMarchas() {
        return quantMarchas;
    }

    public void setQuantMarchas(int quantMarchas) {
        this.quantMarchas = quantMarchas;
    }

    public String getAmortecedor() {
        return amortecedor;
    }

    public void setAmortecedor(String amortecedor) {
        this.amortecedor = amortecedor;
    }

}