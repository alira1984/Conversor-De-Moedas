import java.util.Scanner;

public class ConversorMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicoCambio servico = new ServicoCambio();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Conversor de Moedas ===");
            System.out.println("1) Dólar para Peso Argentino");
            System.out.println("2) Peso Argentino para Dólar");
            System.out.println("3) Dólar para Real brasileiro");
            System.out.println("4) Real brasileiro para Dólar");
            System.out.println("5) Dólar para Peso Colombiano");
            System.out.println("6) Peso Colombiano para Dólar");
            System.out.println("7) Sair");
            System.out.print("Escolha uma opção para conversão de moeda: ");
            int opcao = scanner.nextInt();

            String moedaOrigem = "";
            String moedaDestino = "";

            if (opcao == 1) {
                moedaOrigem = "USD";
                moedaDestino = "ARS";
            } else if (opcao == 2) {
                moedaOrigem = "ARS";
                moedaDestino = "USD";
            } else if (opcao == 3) {
                moedaOrigem = "USD";
                moedaDestino = "BRL";
            } else if (opcao == 4) {
                moedaOrigem = "BRL";
                moedaDestino = "USD";
            } else if (opcao == 5) {
                moedaOrigem = "USD";
                moedaDestino = "COP";
            } else if (opcao == 6) {
                moedaOrigem = "COP";
                moedaDestino = "USD";
            } else if (opcao == 7) {
                System.out.println("Encerrando o programa.");
                continuar = false;
                return;
            } else {
                System.out.println("Opção inválida. Digite novamente uma opção valida.");
                continue;
            }


            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            double resultado = servico.converter(moedaOrigem, moedaDestino, valor);
            if (resultado != -1) {
                System.out.printf("O valor de %.2f %s convertido para %s é igual a %.2f %s%n",valor, moedaOrigem, moedaDestino, resultado, moedaDestino);
            }
        }

        scanner.close();
    }
}
