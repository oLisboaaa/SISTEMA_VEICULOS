// Classe Motocicleta que herda de Veiculo
class Motocicleta extends Veiculo {
    private int cc; // Cilindrada em cm³
    private int torque; // Torque em Nm

    // Construtor para inicializar os atributos da motocicleta
    public Motocicleta(String modelo, int anoFab, String montadora, String cor, double km, int cc, int torque) {
        super(modelo, anoFab, montadora, cor, km); // Chama o construtor da classe pai
        setCc(cc); // Define a cilindrada usando o setter
        setTorque(torque); // Define o torque usando o setter
    }

    // Métodos getters e setters para os atributos específicos da motocicleta

    public int getCc() {
        return cc; // Retorna a cilindrada
    }

    public void setCc(int cc) {
        // Valida se a cilindrada é maior que 0
        if (cc < 1) {
            throw new IllegalArgumentException("Cilindradas devem ser maiores que 0 cc");
        }
        this.cc = cc; // Atribui a cilindrada
    }

    public int getTorque() {
        return torque; // Retorna o torque
    }

    public void setTorque(int torque) {
        // Valida se o torque é maior que 0
        if (torque < 1) {
            throw new IllegalArgumentException("O torque deve ser maior que 0 Nm");
        }
        this.torque = torque; // Atribui o torque
    }

    // Sobrescrita do método toInsertSQL para incluir atributos da motocicleta
    @Override
    public String toInsertSQL() {
        return "INSERT INTO " + this.getClass().getSimpleName()
                + " (modelo, anoFab, montadora, cor, km, cc, torque) VALUES ('" +
                getModelo() + "', " + getAnoFab() + ", '" + getMontadora() + "', '" +
                getCor() + "', " + getKm() + ", " + cc + ", " + torque + ");";
    }
}
