class Bicicleta extends Veiculo {
    private String marca;
    private String material;
    private int quantMarchas;
    private String amortecedor;

    public Bicicleta(String modelo, int anoFab, String montadora, String cor, float km, String marca, String material,
            int quantMarchas, String amortecedor) {
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
        if (marca == null) {
            throw new IllegalArgumentException("Marca não pode ser null");
        }
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (material == null) {
            throw new IllegalArgumentException("Material não pode ser null");
        }
        this.material = material;
    }

    public int getQuantMarchas() {
        return quantMarchas;
    }

    public void setQuantMarchas(int quantMarchas) {
        if (quantMarchas < 1) {
            throw new IllegalArgumentException("Quantidade de marchas inválidas");
        }
        this.quantMarchas = quantMarchas;
    }

    public String getAmortecedor() {
        return amortecedor;
    }

    public void setAmortecedor(String amortecedor) {
        if (amortecedor == null) {
            throw new IllegalArgumentException("Amortecedor não pode ser null");
        }
        if (amortecedor != "mola" || amortecedor != "ar" || amortecedor != "hidraulico") {
            throw new IllegalArgumentException("os amortecedores devem ser iguais a:\nmola \nar \nhidraulico");
        }
        {
            throw new IllegalArgumentException("Os amortecedores devem ser iguais a:\nmola \nar \nhidraulico");
        }
        // this.amortecedor = amortecedor;
    }
}
