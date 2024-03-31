package view;

import java.util.Scanner;
import controller.NPRController;
import br.edu.fateczl.pilhainteiros.Pilha;

public class Principal {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NPRController nprController = new NPRController();
        Pilha pilha = new Pilha();

        boolean continuar = true;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir n�mero");
            System.out.println("2. Realizar opera��o");
            System.out.println("3. Encerrar programa");
            System.out.print("Escolha uma op��o: ");
            int opcao = scanner.nextInt();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o n�mero a ser inserido: ");
                        int numero = scanner.nextInt();
                        nprController.insereValor(pilha, numero);
                        break;
                    case 2:
                        System.out.print("Digite a opera��o (+,-,*,/): ");
                        String operacao = scanner.next();
                        int resultado = nprController.npr(pilha, operacao);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Op��o inv�lida! Digite novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (continuar);

        scanner.close();
    }
}

