// Classe Bicicleta que herda de Veiculo
class Bicicleta extends Veiculo {
    private String marca; // Marca da bicicleta
    private String material; // Material da bicicleta
    private int quantMarchas; // Quantidade de marchas
    private String amortecedor; // Tipo de amortecedor

    // Construtor para inicializar os atributos da bicicleta
    public Bicicleta(String modelo, int anoFab, String montadora, String cor, double km, String marca, String material,
            int quantMarchas, String amortecedor) {
        super(modelo, anoFab, montadora, cor, km); // Chama o construtor da classe pai
        setMarca(marca); // Define a marca usando o setter
        setMaterial(material); // Define o material usando o setter
        setQuantMarchas(quantMarchas); // Define a quantidade de marchas usando o setter
        setAmortecedor(amortecedor); // Define o tipo de amortecedor usando o setter
    }

    // Métodos getters e setters para os atributos específicos da bicicleta

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

    public String getMaterial() {
        return material; // Retorna o material
    }

    public void setMaterial(String material) {
        // Valida se o material não é nulo ou vazio
        if (material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("Material não pode estar vazio");
        }
        this.material = material; // Atribui o material
    }

    public int getQuantMarchas() {
        return quantMarchas; // Retorna a quantidade de marchas
    }

    public void setQuantMarchas(int quantMarchas) {
        // Valida se a quantidade de marchas é maior que 0
        if (quantMarchas < 1) {
            throw new IllegalArgumentException("Quantidade de marchas inválida");
        }
        this.quantMarchas = quantMarchas; // Atribui a quantidade de marchas
    }

    public String getAmortecedor() {
        return amortecedor; // Retorna o tipo de amortecedor
    }

    public void setAmortecedor(String amortecedor) {
        // Valida se o tipo de amortecedor não é nulo ou vazio
        if (amortecedor == null || amortecedor.trim().isEmpty()) {
            throw new IllegalArgumentException("Amortecedor não pode ser nulo");
        }
        // Valida se o tipo de amortecedor é um dos tipos permitidos
        if (!amortecedor.equalsIgnoreCase("mola") && !amortecedor.equalsIgnoreCase("ar")
                && !amortecedor.equalsIgnoreCase("hidraulico")) {
            throw new IllegalArgumentException("Os amortecedores devem ser: mola, ar ou hidraulico");
        }
        this.amortecedor = amortecedor; // Atribui o tipo de amortecedor
    }

    // Sobrescrita do método toInsertSQL para incluir atributos da bicicleta
    @Override
    public String toInsertSQL() {
        return "INSERT INTO " + this.getClass().getSimpleName()
                + " (modelo, anoFab, montadora, cor, km, marca, material, quantMarchas, amortecedor) VALUES ('" +
                getModelo() + "', " + getAnoFab() + ", '" + getMontadora() + "', '" +
                getCor() + "', " + getKm() + ", '" + marca + "', '" + material + "', " + quantMarchas + ", '"
                + amortecedor + "');";
    }
}