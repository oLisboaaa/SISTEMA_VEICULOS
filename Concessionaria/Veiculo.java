import java.time.Year;

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
        if (modelo == null) {
            throw new IllegalArgumentException("Modelo não pode estar vazia");
        }
        this.modelo = modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        int anoAtual = Year.now().getValue();
        if (anoFab > anoAtual) {
            throw new IllegalArgumentException("Ano de fabricação não pode ser posterior ao ano atual: " + anoAtual);
        }
        this.anoFab = anoFab;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        if (montadora == null) {
            throw new IllegalArgumentException("Montadora não pode estar vazia");
        }
        this.montadora = montadora;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null) {
            throw new IllegalArgumentException("Cor não pode estar vazia");
        }
        this.cor = cor;
    }

    public Float getKm() {
        return km;
    }

    public void setKm(Float km) {
        if (km == null) {
            throw new IllegalArgumentException("Quilometragem não pode estar vazia");
        }
        if (km < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo");
        }
        this.km = km;
    }

}
