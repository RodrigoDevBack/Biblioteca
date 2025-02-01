package Tests.LibraryTeste;

import domain.EstanteCrud;
import domain.Library;

import java.util.Scanner;

public class LibraryTeste {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        EstanteCrud estanteCrud = new EstanteCrud();
        String opcaoEscolhida;
        int opcaoEscolhidaInt;

        do {
            System.out.println("------------------------------------------");
            System.out.println("Bem vindo a Biblioteca! \nOpções: \n[1]Criar uma estante \n[2]Ver livros na estante \n[3]Ver estantes \n[4]Manusear a estante \n[0]Sair");
            System.out.println("Digite sua escolha: ");

            opcaoEscolhida = scanner.nextLine();
            opcaoEscolhidaInt = Integer.parseInt(opcaoEscolhida);

            switch (opcaoEscolhidaInt) {
                case 1:
                    //estanteCrud.setBook();
                    library.setBookcase(estanteCrud);
                    break;

                case 2:
                    //estanteCrud.getBooks();
                    library.getIdBookcase(estanteCrud, 0);
                    break;

                case 3:
                    library.getShelves(estanteCrud);
                    break;

                case 4:
                    do {
                        System.out.println("------------------------------------------");
                        System.out.println("Bem vindo a estante! \nOpções: \n[1]Adicionar um livro \n[2]Ver livros \n[3]Ver livro específico \n[4]Atualizar livro \n[5]Deletar \n[0]Sair");
                        System.out.println("Digite sua escolha: ");

                        opcaoEscolhida = scanner.nextLine();
                        opcaoEscolhidaInt = Integer.parseInt(opcaoEscolhida);

                        switch (opcaoEscolhidaInt) {
                            case 1:
                                estanteCrud.setBook();
                                break;

                            case 2:
                                estanteCrud.getBooks();
                                break;

                            case 3:
                                estanteCrud.getBook();
                                break;

                            case 4:
                                estanteCrud.upBook();
                                break;

                            case 5:
                                estanteCrud.deleteBook();
                                break;

                        }

                        break;
                    } while (opcaoEscolhidaInt != 0);
                    break;
                case 5:
                    estanteCrud.deleteBook();
                    break;

            }
        } while (opcaoEscolhidaInt != 0);
    }
}
