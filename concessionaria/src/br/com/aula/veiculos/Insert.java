package br.com.aula.veiculos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Connection conexao = ConexaoDB.conectar();
        String sql = null;

        if (conexao != null) {
            System.out.println("\n=== Gerenciamento da Tabela de Veículos ===");
            System.out.println("1 - Veículo Doméstico");
            System.out.println("2 - Motocicleta");
            System.out.println("3 - Caminhão");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opção: ");
            int escolha = scan.nextInt();
            scan.nextLine();

            try {
                PreparedStatement stmt;

                if (escolha == 1) {
                    sql = "INSERT INTO domestico (modelo, anoFab, montadora, cor, km, quantMax, tipFreio, airbag) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                    stmt = conexao.prepareStatement(sql);

                    System.out.print("Modelo: ");
                    String modelo = scan.nextLine();
                    System.out.print("Ano de Fabricação: ");
                    int anoFab = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Montadora: ");
                    String montadora = scan.nextLine();
                    System.out.print("Cor: ");
                    String cor = scan.nextLine();
                    System.out.print("Quilometragem: ");
                    double km = scan.nextDouble();
                    System.out.print("Quantidade Máxima de Passageiros: ");
                    int quantMax = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Tipo de Freio: ");
                    String tipFreio = scan.nextLine();
                    System.out.print("Possui Airbag (true/false): ");
                    boolean airbag = scan.nextBoolean();

                    stmt.setString(1, modelo);
                    stmt.setInt(2, anoFab);
                    stmt.setString(3, montadora);
                    stmt.setString(4, cor);
                    stmt.setDouble(5, km);
                    stmt.setInt(6, quantMax);
                    stmt.setString(7, tipFreio);
                    stmt.setBoolean(8, airbag);
                } else if (escolha == 2) {
                    sql = "INSERT INTO motocicleta (modelo, anoFab, montadora, cor, km, cc, torque) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    stmt = conexao.prepareStatement(sql);

                    System.out.print("Modelo: ");
                    String modelo = scan.nextLine();
                    System.out.print("Ano de Fabricação: ");
                    int anoFab = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Montadora: ");
                    String montadora = scan.nextLine();
                    System.out.print("Cor: ");
                    String cor = scan.nextLine();
                    System.out.print("Quilometragem: ");
                    double km = scan.nextDouble();
                    System.out.print("Cilindrada (CC): ");
                    int cc = scan.nextInt();
                    System.out.print("Torque (kgf.m): ");
                    double torque = scan.nextDouble();

                    stmt.setString(1, modelo);
                    stmt.setInt(2, anoFab);
                    stmt.setString(3, montadora);
                    stmt.setString(4, cor);
                    stmt.setDouble(5, km);
                    stmt.setInt(6, cc);
                    stmt.setDouble(7, torque);
                } else if (escolha == 3) {
                    sql = "INSERT INTO caminhao (modelo, anoFab, montadora, cor, km, quantEixo, pesoB) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    stmt = conexao.prepareStatement(sql);

                    System.out.print("Modelo: ");
                    String modelo = scan.nextLine();
                    System.out.print("Ano de Fabricação: ");
                    int anoFab = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Montadora: ");
                    String montadora = scan.nextLine();
                    System.out.print("Cor: ");
                    String cor = scan.nextLine();
                    System.out.print("Quilometragem: ");
                    double km = scan.nextDouble();
                    System.out.print("Quantidade de Eixos: ");
                    int quantEixo = scan.nextInt();
                    System.out.print("Peso Bruto (em toneladas): ");
                    double pesoB = scan.nextDouble();

                    stmt.setString(1, modelo);
                    stmt.setInt(2, anoFab);
                    stmt.setString(3, montadora);
                    stmt.setString(4, cor);
                    stmt.setDouble(5, km);
                    stmt.setInt(6, quantEixo);
                    stmt.setDouble(7, pesoB);
                } else if (escolha == 0) {
                    System.out.println("Saindo...");
                    return;
                } else {
                    System.out.println("Opção inválida!");
                    return;
                }

                int rowsInserted = stmt.executeUpdate();
                System.out.println(rowsInserted > 0 ? "Dados inseridos com sucesso!" : "Falha ao inserir dados.");
            } catch (SQLException e) {
                System.err.println("Erro ao inserir dados: " + e.getMessage());
            }
        } else {
            System.out.println("Erro ao conectar ao banco de dados.");
        }
    }
}
