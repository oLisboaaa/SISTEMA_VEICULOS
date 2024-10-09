// Classe Caminhao que herda de Veiculo
class Caminhao extends Veiculo {
    private int quantEixo; // Quantidade de eixos
    private double pesoB; // Peso bruto em toneladas

    // Construtor para inicializar os atributos do caminhão
    public Caminhao(String modelo, int anoFab, String montadora, String cor, double km, int quantEixo, double pesoB) {
        super(modelo, anoFab, montadora, cor, km); // Chama o construtor da classe pai
        setQuantEixo(quantEixo); // Define a quantidade de eixos usando o setter
        setPesoB(pesoB); // Define o peso bruto usando o setter
    }

    // Métodos getters e setters para os atributos específicos do caminhão

    public int getQuantEixo() {
        return quantEixo; // Retorna a quantidade de eixos
    }

    public void setQuantEixo(int quantEixo) {
        // Valida se a quantidade de eixos é maior que 0
        if (quantEixo < 1) {
            throw new IllegalArgumentException("Quantidade de eixos inválida");
        }
        this.quantEixo = quantEixo; // Atribui a quantidade de eixos
    }

    public double getPesoB() {
        return pesoB; // Retorna o peso bruto
    }

    public void setPesoB(double pesoB) {
        // Valida se o peso bruto é maior que 1 tonelada
        if (pesoB < 1) {
            throw new IllegalArgumentException("Peso bruto deve ser maior que 1 tonelada");
        }
        this.pesoB = pesoB; // Atribui o peso bruto
    }

    // Sobrescrita do método toInsertSQL para incluir atributos do caminhão
    @Override
    public String toInsertSQL() {
        return "INSERT INTO " + this.getClass().getSimpleName()
                + " (modelo, anoFab, montadora, cor, km, quantEixo, pesoB) VALUES ('" +
                getModelo() + "', " + getAnoFab() + ", '" + getMontadora() + "', '" +
                getCor() + "', " + getKm() + ", " + quantEixo + ", " + pesoB + ");";
    }
}