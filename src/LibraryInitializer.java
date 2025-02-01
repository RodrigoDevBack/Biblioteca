import domain.EstanteCrud;

import java.util.Scanner;

public class LibraryInitializer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstanteCrud estante = new EstanteCrud();
        String opcaoEscolhida;
        int opcaoEscolhidaInt;

        do {
            System.out.println("------------------------------------------");
            System.out.println("Bem vindo a estante! \nOpções: \n[1]Adicionar um livro \n[2]Ver livros \n[3]Ver livro específico \n[4]Atualizar livro \n[5]Deletar \n[0]Sair");
            System.out.println("Digite sua escolha: ");

            opcaoEscolhida = scanner.nextLine();
            opcaoEscolhidaInt = Integer.parseInt(opcaoEscolhida);

            switch (opcaoEscolhidaInt) {
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
                    break;

                case 5:
                    estante.deleteBook();
                    break;

            }
        } while (opcaoEscolhidaInt != 0);
    }
}
