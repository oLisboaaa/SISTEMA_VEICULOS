class Veiculo {
    private String modelo;
    private int anoFab;
    private String montadora;
    private String cor;
    private Float km;

    public Veiculo(String modelo, int anoFab, String montadora, String cor, float km) {
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.montadora = montadora;
        this.cor = cor;
        this.km = km;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAnoFab() {
        return anoFab;
    }
    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }
    

    public String getMontadora() {
        return montadora;
    }
    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }
    

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    

    public Float getKm() {
        return km;
    }
    public void setKm(Float km) {
        this.km = km;
    }

}
