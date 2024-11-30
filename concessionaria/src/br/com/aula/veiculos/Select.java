package br.com.aula.veiculos;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class Select {
    public static void main(String[] args) {
        Connection conexao = ConexaoDB.conectar();
        Scanner scan = new Scanner(System.in);

        if (conexao != null) {
            System.out.println("\n=== Exibição de Tabelas ===");
            System.out.println("1 - Caminhão");
            System.out.println("2 - Veículo Doméstico");
            System.out.println("3 - Motocicleta");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma tabela para exibir: ");
            int escolha = scan.nextInt();
            scan.nextLine();

            String sql = null;
            switch (escolha) {
                case 1:
                    sql = "SELECT * FROM caminhao";
                    exibirTabela(conexao, sql, "Caminhão");
                    break;
                case 2:
                    sql = "SELECT * FROM domestico";
                    exibirTabela(conexao, sql, "Veículo Doméstico");
                    break;
                case 3:
                    sql = "SELECT * FROM motocicleta";
                    exibirTabela(conexao, sql, "Motocicleta");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        } else {
            System.out.println("Erro ao conectar ao banco de dados.");
        }
    }

    private static void exibirTabela(Connection conexao, String sql, String nomeTabela) {
        try (Statement stmt = conexao.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n=== Dados da Tabela: " + nomeTabela + " ===");

            if (nomeTabela.equals("Caminhão")) {
                System.out.printf("%-5s %-20s %-10s %-20s %-10s %-10s %-10s %-10s%n",
                        "ID", "Modelo", "AnoFab", "Montadora", "Cor", "KM", "Eixos", "PesoB");
                System.out.println("---------------------------------------------------------------------------------------");
                while (rs.next()) {
                    System.out.printf("%-5d %-20s %-10d %-20s %-10s %-10.3f %-10d %-10.2f%n",
                            rs.getInt("id"), rs.getString("modelo"), rs.getInt("anoFab"),
                            rs.getString("montadora"), rs.getString("cor"),
                            rs.getDouble("km"), rs.getInt("quantEixo"), rs.getDouble("pesoB"));
                }
            } else if (nomeTabela.equals("Veículo Doméstico")) {
                System.out.printf("%-5s %-20s %-10s %-20s %-10s %-10s %-10s %-10s %-10s%n",
                        "ID", "Modelo", "AnoFab", "Montadora", "Cor", "KM", "Pass.", "Freio", "Airbag");
                System.out.println("----------------------------------------------------------------------------------------------------");
                while (rs.next()) {
                    System.out.printf("%-5d %-20s %-10d %-20s %-10s %-10.3f %-10d %-10s %-10s%n",
                            rs.getInt("id"), rs.getString("modelo"), rs.getInt("anoFab"),
                            rs.getString("montadora"), rs.getString("cor"),
                            rs.getDouble("km"), rs.getInt("quantMax"),
                            rs.getString("tipFreio"), rs.getBoolean("airbag"));
                }
            } else if (nomeTabela.equals("Motocicleta")) {
                System.out.printf("%-5s %-20s %-10s %-20s %-10s %-10s %-10s %-10s%n",
                        "ID", "Modelo", "AnoFab", "Montadora", "Cor", "KM", "CC", "Torque");
                System.out.println("---------------------------------------------------------------------------------------");
                while (rs.next()) {
                    System.out.printf("%-5d %-20s %-10d %-20s %-10s %-10.3f %-10d %-10.1f%n",
                            rs.getInt("id"), rs.getString("modelo"), rs.getInt("anoFab"),
                            rs.getString("montadora"), rs.getString("cor"),
                            rs.getDouble("km"), rs.getInt("cc"), rs.getDouble("torque"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao exibir dados da tabela: " + e.getMessage());
        }
    }
}
