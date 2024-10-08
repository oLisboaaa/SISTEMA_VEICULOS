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
        if (marca == null) {
            throw new IllegalArgumentException("Marca não pode estar vazia");
        }
        this.marca = marca;
    }

    public String getRodas() {
        return rodas;
    }

    public void setRodas(String rodas) {
        if (rodas == null) {
            throw new IllegalArgumentException("Rodas não pode estar vazia");
        }
        this.rodas = rodas;
    }
}
