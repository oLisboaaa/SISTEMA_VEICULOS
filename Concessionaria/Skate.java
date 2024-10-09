// Classe Skate que herda de Veiculo
class Skate extends Veiculo {
    private String marca; // Marca do skate
    private String rodas; // Tamanho das rodas

    // Construtor para inicializar os atributos do skate
    public Skate(String modelo, int anoFab, String montadora, String cor, double km, String marca, String rodas) {
        super(modelo, anoFab, montadora, cor, km); // Chama o construtor da classe pai
        setMarca(marca); // Define a marca usando o setter
        setRodas(rodas); // Define o tamanho das rodas usando o setter
    }

    // Métodos getters e setters para os atributos específicos do skate

    public String getMarca() {
        return marca; // Retorna a marca
    }

    public void setMarca(String marca) {
        // Valida se a marca não é nula ou vazia
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca não pode estar vazia");
        }
        this.marca = marca; // Atribui a marca
    }

    public String getRodas() {
        return rodas; // Retorna o tamanho das rodas
    }

    public void setRodas(String rodas) {
        // Valida se o tamanho das rodas não é nulo ou vazio
        if (rodas == null || rodas.trim().isEmpty()) {
            throw new IllegalArgumentException("Rodas não podem estar vazias");
        }
        this.rodas = rodas; // Atribui o tamanho das rodas
    }

    // Sobrescrita do método toInsertSQL para incluir atributos do skate
    @Override
    public String toInsertSQL() {
        return "INSERT INTO " + this.getClass().getSimpleName()
                + " (modelo, anoFab, montadora, cor, km, marca, rodas) VALUES ('" +
                getModelo() + "', " + getAnoFab() + ", '" + getMontadora() + "', '" +
                getCor() + "', " + getKm() + ", '" + marca + "', '" + rodas + "');";
    }
}
