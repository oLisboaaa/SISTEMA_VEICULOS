// Classe Concessionaria para executar o código
public class Concessionaria {
        public static void main(String[] args) {
                try {
                        // Criação de um veículo doméstico e impressão do comando SQL
                        Veiculo domestico = new Domestico("Fusca", 1975, "Volkswagen", "azul", 30000.0, 5, "disco", 4);
                        System.out.println(domestico.toInsertSQL());
                } catch (IllegalArgumentException e) {
                        // Captura e exibe exceções durante a criação do veículo doméstico
                        System.out.println("Erro ao criar veículo doméstico: " + e.getMessage());
                }

                try {
                        // Criação de uma motocicleta e impressão do comando SQL
                        Veiculo moto = new Motocicleta("CB500", 2020, "Honda", "vermelha", 12000.0, 500, 40);
                        System.out.println(moto.toInsertSQL());
                } catch (IllegalArgumentException e) {
                        // Captura e exibe exceções durante a criação da motocicleta
                        System.out.println("Erro ao criar motocicleta: " + e.getMessage());
                }

                try {
                        // Criação de um skate e impressão do comando SQL
                        Veiculo skate = new Skate("Skate Pro", 2022, "Skate Co", "preto", 0.0, "Skate Co", "72mm");
                        System.out.println(skate.toInsertSQL());
                } catch (IllegalArgumentException e) {
                        // Captura e exibe exceções durante a criação do skate
                        System.out.println("Erro ao criar skate: " + e.getMessage());
                }

                try {
                        // Criação de um caminhão e impressão do comando SQL
                        Veiculo caminhao = new Caminhao("Volvo FH", 2018, "Volvo", "branco", 120000.0, 3, 18.5);
                        System.out.println(caminhao.toInsertSQL());
                } catch (IllegalArgumentException e) {
                        // Captura e exibe exceções durante a criação do caminhão
                        System.out.println("Erro ao criar caminhão: " + e.getMessage());
                }

                try {
                        // Criação de uma bicicleta e impressão do comando SQL
                        Veiculo bicicleta = new Bicicleta("Caloi", 2022, "Caloi", "verde", 0.0, "Caloi", "alumínio", 18,
                                        "ar");
                        System.out.println(bicicleta.toInsertSQL());
                } catch (IllegalArgumentException e) {
                        // Captura e exibe exceções durante a criação da bicicleta
                        System.out.println("Erro ao criar bicicleta: " + e.getMessage());
                }
        }
}