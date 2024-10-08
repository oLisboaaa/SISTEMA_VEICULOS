public class Concessionaria {
    public static void main(String[] args) {
        // Criando instâncias de diferentes tipos de veículos
        Veiculo carro = new Domestico("Fusca", 1970, "Volkswagen", "azul", 50000.0f, 5, "disco", 2);
        Veiculo moto = new Motocicleta("CB500", 2021, "Honda", "vermelha", 1500.0f, 500, 50);
        Veiculo skate = new Skate("Skate X", 2023, "SkateBrand", "preto", 0.0f, "SkateCo", "72mm");
        Veiculo caminhao = new Caminhao("Volvo FH", 2018, "Volvo", "branco", 120000.0f, 3, 18.5f);
        Veiculo bicicleta = new Bicicleta("Caloi", 2022, "Caloi", "verde", 0.0f, "Caloi", "alumínio", 18, "ar");

        // Exibindo as informações dos veículos
        System.out.println("Carro: " + carro.getModelo() + ", Montadora: " + carro.getMontadora() + ", Ano: "
                + carro.getAnoFab());
        System.out.println("Moto: " + moto.getModelo() + ", Montadora: " + moto.getMontadora() + ", Ano: "
                + moto.getAnoFab());
        System.out.println("Skate: " + skate.getModelo() + ", Montadora: " + skate.getMontadora() + ", Ano: "
                + skate.getAnoFab());
        System.out.println("Caminhao: " + caminhao.getModelo() + ", Montadora: " + caminhao.getMontadora() + ", Ano: "
                + caminhao.getAnoFab());
        System.out.println("Bicicleta: " + bicicleta.getModelo() + ", Montadora: " + bicicleta.getMontadora()
                + ", Ano: " + bicicleta.getAnoFab());

        // Exibindo informações adicionais
        System.out.println("\nInformações adicionais:");
        System.out.println("Carro - Cor: " + carro.getCor() + ", Quilometragem: " + carro.getKm() + " km, Airbags: "
                + ((Domestico) carro).getAirbag());
        System.out.println("Motocicleta - CC: " + ((Motocicleta) moto).getCc() + ", Torque: "
                + ((Motocicleta) moto).getTorque() + " Nm");
        System.out.println("Skate - Marca: " + ((Skate) skate).getMarca() + ", Rodas: " + ((Skate) skate).getRodas());
        System.out.println("Caminhão - Eixos: " + ((Caminhao) caminhao).getQuantEixo() + ", Peso Bruto: "
                + ((Caminhao) caminhao).getPesoB() + " Ton");
        System.out.println("Bicicleta - Marca: " + ((Bicicleta) bicicleta).getMarca() + ", Material: "
                + ((Bicicleta) bicicleta).getMaterial() + ", Marchas: " + ((Bicicleta) bicicleta).getQuantMarchas());
    }
}
