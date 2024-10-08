class Motocicleta extends Veiculo {
    private int cc;
    private int torque;

    public Motocicleta(String modelo, int anoFab, String montadora, String cor, float km, int cc, int torque) {
        super(modelo, anoFab, montadora, cor, km);
        this.cc = cc;
        this.torque = torque;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        if (cc < 1) {
            throw new IllegalArgumentException("Cilindradas devem ser maior que 0 cc");
        }
        this.cc = cc;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        if (torque < 1) {
            throw new IllegalArgumentException("O torque deve ser maior que 0 Nm");
        }
        this.torque = torque;
    }
}
