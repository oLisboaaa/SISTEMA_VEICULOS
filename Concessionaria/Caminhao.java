class Caminhao extends Veiculo {
    private int quantEixo;
    private float pesoB;

    public Caminhao(String modelo, int anoFab, String montadora, String cor, float km, int quantEixo, float pesoB) {
        super(modelo, anoFab, montadora, cor, km);
        this.quantEixo = quantEixo;
        this.pesoB = pesoB;
    }

    public int getQuantEixo() {
        return quantEixo;
    }

    public void setQuantEixo(int quantEixo) {

        if (quantEixo < 1) {
            throw new IllegalArgumentException("Quantidade de eixos inválidas");
        }

        this.quantEixo = quantEixo;
    }

    public float getPesoB() {
        return pesoB;
    }

    public void setPesoB(float pesoB) {

        if (pesoB < 1) {
            throw new IllegalArgumentException(
                    "Peso bruto invalido, o peso deve ser excrito como no exemplo a seguir\n 2.4 Ton");
        }

        this.pesoB = pesoB;
    }
}