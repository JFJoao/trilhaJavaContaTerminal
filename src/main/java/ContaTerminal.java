import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Formatação padrão dos números para o formato US
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

// Loop para obter o número da conta
        while (true) {
            try {
                System.out.println("Por favor, digite o número da Conta (apenas números):");
                String numeroContaStr = scanner.nextLine();
                if (!numeroContaStr.matches("[0-9]+")) {
                    throw new InputMismatchException();
                }
                numeroConta = Integer.parseInt(numeroContaStr);
                break; // Sair do loop se a entrada for válida
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite um número válido para a conta.");
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número válido para a conta.");
            }
        }


// Loop para obter o saldo
        while (true) {
            try {
                System.out.println("Por favor, digite o saldo (apenas números):");
                String saldoStr = scanner.nextLine();
                if (!saldoStr.matches("[0-9]+(\\.\\d+)?")) {
                    throw new InputMismatchException();
                }
                saldo = Double.parseDouble(saldoStr);
                break; // Sair do loop se a entrada for válida
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite um número válido para o saldo.");
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número válido para o saldo.");
            }
        }


        // Loop para obter o nome do cliente
        while (true) {
            System.out.println("Por favor, digite o nome do Cliente (apenas letras):");
            nomeCliente = scanner.nextLine();
            if (nomeCliente.matches("[a-zA-Z]+")) {
                break; // Sair do loop se a entrada for válida
            } else {
                System.out.println("Erro: Por favor, digite um nome válido.");
            }
        }

// Loop para obter a agência
        while (true) {
            try {
                System.out.println("Por favor, digite o número da Agência (apenas números):");
                String agenciaStr = scanner.nextLine();
                if (!agenciaStr.matches("[0-9]+")) {
                    throw new InputMismatchException();
                }
                agencia = String.valueOf(Integer.parseInt(agenciaStr));
                break; // Sair do loop se a entrada for válida
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número válido para a agência.");
            }
        }


        // Exibir os dados do cliente
        exibirDadosCliente(nomeCliente, agencia, numeroConta, saldo);

        // Fechar o scanner
        scanner.close();
    }

    private static void exibirDadosCliente(String nomeCliente, String agencia, int numeroConta, double saldo) {
        System.out.println(String.format("Olá %s,", nomeCliente));
        System.out.println(String.format("Sua agência é %s, conta %d, e seu saldo é R$%.2f.", agencia, numeroConta, saldo));
        System.out.println("Seu saldo já está disponível para saque.");
    }
}
