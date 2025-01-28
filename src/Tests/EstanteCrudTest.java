package Tests;

import main.EstanteCrud;

import java.util.Scanner;

public class EstanteCrudTest {
    public static void main(String[] args) {
        EstanteCrud estante = new EstanteCrud();
        Scanner scanner = new Scanner(System.in);
        int opcaoEscolhida;
        do {
            System.out.println("------------------------------------------");
            System.out.println("Bem vindo a estante! \nOpções: \n[1]Adicionar um livro \n[2]Ver livros \n[3]Ver livro específico \n[4]Atualizar livro \n[5]Deletar \n[0]Sair");
            System.out.println("Digite sua escolha: ");
            opcaoEscolhida = scanner.nextInt();
            switch (opcaoEscolhida) {
                case 1:
                    estante.setBook();
                    break;
                case 2:
                    estante.getBooks();
                    break;
                case 3:
                    estante.getBook();
                    break;
                case 4:
                    estante.upBook();

                case 5:
                    estante.deleteBook();

            }
        } while (opcaoEscolhida != 0);
    }
}
