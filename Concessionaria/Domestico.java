class Domestico extends Veiculo {
    private int quantMax;
    private String tipFreio;
    private int airbag;

    public Domestico(String modelo, int anoFab, String montadora, String cor, float km, int quantMax, String tipFreio,
            int airbag) {
        super(modelo, anoFab, montadora, cor, km);
        this.quantMax = quantMax;
        this.tipFreio = tipFreio;
        this.airbag = airbag;
    }

    public int getQuantMax() {
        return quantMax;
    }

    public void setQuantMax(int quantMax) {

        if (quantMax < 2 || quantMax > 8) {
            throw new IllegalArgumentException("quantidade maxima de pessoas invalida!");
        }

        this.quantMax = quantMax;
    }

    public String getTipFreio() {
        return tipFreio;
    }

    public void setTipFreio(String tipFreio) {
        if (tipFreio == null) {
            throw new IllegalArgumentException("Tipo de freio não pode estar vazia");
        }

        if (tipFreio != "disco" || tipFreio != "tambor") {
            throw new IllegalArgumentException("os freios devem ser a disco ou a tambor");
        }

        this.tipFreio = tipFreio;
    }

    public int getAirbag() {
        return airbag;
    }

    public void setAirbag(int airbag) {

        if (airbag < 2) {
            throw new IllegalArgumentException(
                    "quantidade de airbags invalida, o minimo estabelecido pelo CONTRAN sao 2 airbags");
        }

        this.airbag = airbag;
    }
}