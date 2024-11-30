package br.com.aula.veiculos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
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
                    sql = "DELETE FROM domestico WHERE id = ?";
                    stmt = conexao.prepareStatement(sql);
                    
                    System.out.println("Qual o ID do veiculo a ser APAGADO?");
                    int id = scan.nextInt();
                    
                    stmt.setInt(1, id);
                } else if (escolha == 2) {
                    sql = "DELETE FROM motocicleta WHERE id = ?";
                    stmt = conexao.prepareStatement(sql);
                    
                    System.out.println("Qual o ID do veiculo a ser APAGADO?");
                    int id = scan.nextInt();
                    
                    stmt.setInt(1, id);
                } else if (escolha == 3) {
                    sql = "DELETE FROM caminhao WHERE id = ?";
                    stmt = conexao.prepareStatement(sql);
                    
                    System.out.println("Qual o ID do veiculo a ser APAGADO?");
                    int id = scan.nextInt();
                    
                    stmt.setInt(1, id);
                } else if (escolha == 0) {
                    System.out.println("Saindo...");
                    return;
                } else {
                    System.out.println("Opção inválida!");
                    return;
                }

                int rowsInserted = stmt.executeUpdate();
                System.out.println(rowsInserted > 0 ? "Dados apagados com sucesso!" : "Falha ao apagados dados.");
            } catch (SQLException e) {
                System.err.println("Erro ao apagar dados: " + e.getMessage());
            }
        } else {
            System.out.println("Erro ao conectar ao banco de dados.");
        }
    }
}
