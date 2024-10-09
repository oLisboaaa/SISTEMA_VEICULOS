import java.time.Year; // Importa a classe Year para obter o ano atual

// Classe base para veículos
class Veiculo {
    private String modelo; // Modelo do veículo
    private int anoFab; // Ano de fabricação
    private String montadora; // Montadora do veículo
    private String cor; // Cor do veículo
    private double km; // Quilometragem

    // Construtor para inicializar os atributos
    public Veiculo(String modelo, int anoFab, String montadora, String cor, double km) {
        setModelo(modelo); // Define o modelo usando o setter
        setAnoFab(anoFab); // Define o ano de fabricação usando o setter
        setMontadora(montadora); // Define a montadora usando o setter
        setCor(cor); // Define a cor usando o setter
        setKm(km); // Define a quilometragem usando o setter
    }

    // Getters e Setters para acessar e modificar os atributos

    public String getModelo() {
        return modelo; // Retorna o modelo
    }

    public void setModelo(String modelo) {
        // Valida se o modelo não é nulo ou vazio
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode estar vazio");
        }
        this.modelo = modelo; // Atribui o modelo
    }

    public int getAnoFab() {
        return anoFab; // Retorna o ano de fabricação
    }

    public void setAnoFab(int anoFab) {
        int anoAtual = Year.now().getValue(); // Obtém o ano atual
        // Valida se o ano de fabricação não é posterior ao ano atual
        if (anoFab > anoAtual) {
            throw new IllegalArgumentException("Ano de fabricação não pode ser posterior ao ano atual: " + anoAtual);
        }
        this.anoFab = anoFab; // Atribui o ano de fabricação
    }

    public String getMontadora() {
        return montadora; // Retorna a montadora
    }

    public void setMontadora(String montadora) {
        // Valida se a montadora não é nula ou vazia
        if (montadora == null || montadora.trim().isEmpty()) {
            throw new IllegalArgumentException("Montadora não pode estar vazia");
        }
        this.montadora = montadora; // Atribui a montadora
    }

    public String getCor() {
        return cor; // Retorna a cor
    }

    public void setCor(String cor) {
        // Valida se a cor não é nula ou vazia
        if (cor == null || cor.trim().isEmpty()) {
            throw new IllegalArgumentException("Cor não pode estar vazia");
        }
        this.cor = cor; // Atribui a cor
    }

    public double getKm() {
        return km; // Retorna a quilometragem
    }

    public void setKm(double km) {
        // Valida se a quilometragem não é negativa
        if (km < 0) {
            throw new IllegalArgumentException("A quilometragem não pode ser negativa");
        }
        this.km = km; // Atribui a quilometragem
    }

    // Método que gera a string SQL para inserção
    public String toInsertSQL() {
        return "INSERT INTO " + this.getClass().getSimpleName() + " (modelo, anoFab, montadora, cor, km) VALUES ('" +
                modelo + "', " + anoFab + ", '" + montadora + "', '" + cor + "', " + km + ");";
    }
}
