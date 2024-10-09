// Classe Domestico que herda de Veiculo
class Domestico extends Veiculo {
    private int quantMax; // Quantidade máxima de passageiros
    private String tipFreio; // Tipo de freio
    private int airbag; // Quantidade de airbags

    // Construtor para inicializar os atributos do veículo doméstico
    public Domestico(String modelo, int anoFab, String montadora, String cor, double km, int quantMax, String tipFreio,
            int airbag) {
        super(modelo, anoFab, montadora, cor, km); // Chama o construtor da classe pai
        setQuantMax(quantMax); // Define a quantidade máxima de passageiros usando o setter
        setTipFreio(tipFreio); // Define o tipo de freio usando o setter
        setAirbag(airbag); // Define a quantidade de airbags usando o setter
    }

    // Métodos getters e setters para os atributos específicos do veículo doméstico

    public int getQuantMax() {
        return quantMax; // Retorna a quantidade máxima de passageiros
    }

    public void setQuantMax(int quantMax) {
        // Valida se a quantidade máxima está entre 2 e 8
        if (quantMax < 2 || quantMax > 8) {
            throw new IllegalArgumentException("Quantidade máxima de pessoas inválida! Deve ser entre 2 e 8.");
        }
        this.quantMax = quantMax; // Atribui a quantidade máxima de passageiros
    }

    public String getTipFreio() {
        return tipFreio; // Retorna o tipo de freio
    }

    public void setTipFreio(String tipFreio) {
        // Valida se o tipo de freio não é nulo ou vazio
        if (tipFreio == null || tipFreio.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo de freio não pode estar vazio");
        }
        // Valida se o tipo de freio é disco ou tambor
        if (!tipFreio.equalsIgnoreCase("disco") && !tipFreio.equalsIgnoreCase("tambor")) {
            throw new IllegalArgumentException("Os freios devem ser a disco ou a tambor");
        }
        this.tipFreio = tipFreio; // Atribui o tipo de freio
    }

    public int getAirbag() {
        return airbag; // Retorna a quantidade de airbags
    }

    public void setAirbag(int airbag) {
        // Valida se a quantidade de airbags é maior que 1
        if (airbag < 2) {
            throw new IllegalArgumentException("Quantidade mínima de airbags é 2, conforme a legislação.");
        }
        this.airbag = airbag; // Atribui a quantidade de airbags
    }

    // Sobrescrita do método toInsertSQL para incluir atributos do veículo doméstico
    @Override
    public String toInsertSQL() {
        return "INSERT INTO " + this.getClass().getSimpleName()
                + " (modelo, anoFab, montadora, cor, km, quantMax, tipFreio, airbag) VALUES ('" +
                getModelo() + "', " + getAnoFab() + ", '" + getMontadora() + "', '" +
                getCor() + "', " + getKm() + ", " + quantMax + ", '" + tipFreio + "', " + airbag + ");";
    }
}
