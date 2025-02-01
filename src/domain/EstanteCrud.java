package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class EstanteCrud {
    protected ArrayList<ArrayList<String>> bookcase = new ArrayList<>();

    protected Scanner scanner = new Scanner(System.in);

    public boolean setBook() {
        String nameBook;
        String nameActor;
        String year;
        String id;
        if (bookcase.size() < 5) {
            ArrayList<String> book = new ArrayList<>();

            System.out.println("-----------------------------------------");
            System.out.println("Nome do book: ");
            nameBook = this.scanner.nextLine();
            System.out.println("-----------------------------------------");

            System.out.println("Autor(a): ");
            nameActor = this.scanner.nextLine();
            System.out.println("-----------------------------------------");

            System.out.println("Ano: ");
            year = this.scanner.nextLine();
            System.out.println("-----------------------------------------");

            id = String.valueOf(this.bookcase.size());

            book.add(id);
            book.add(nameBook);
            book.add(nameActor);
            book.add(year);

            this.bookcase.add(book);
            System.out.println("Livro adicionado.");
            return true;
        } else {
            System.out.println("Estante Cheia");
            return false;
        }
    }

    public ArrayList<ArrayList<String>> getBooks() {
        System.out.println("-----------------------------------------");
        System.out.println("Livros atuais: \n" + this.bookcase);
        System.out.println("-----------------------------------------");

        return this.bookcase;
    }

    public void getBook() {
        int idNew;

        System.out.println("-----------------------------------------");
        idNew = setId("Digite o id do livro: ");
        System.out.println("-----------------------------------------");

        String livro = String.valueOf(this.bookcase.get(idNew));
        System.out.println(livro);
        System.out.println("-----------------------------------------");
    }

    public void upBook() {
        String escolha;
        String trocar;
        int idNew;

        System.out.println("-----------------------------------------");
        idNew = setId("Digite o id do livro: ");
        System.out.println("-----------------------------------------");

        System.out.println("O que deseja atualizar? \n[1] Nome do livro \n[2]Autor \n[3]Ano \n[0]Cancelar atualização");
        escolha = this.scanner.nextLine();

        switch (escolha) {
            case "0":
                break;
            case "1":
                System.out.println("Digite o novo nome do livro: ");
                trocar = this.scanner.nextLine();
                this.bookcase.get(idNew).remove(1);
                this.bookcase.get(idNew).listIterator(1).add(trocar);
                break;
            case "2":
                System.out.println("Digite autor corrigido: ");
                trocar = this.scanner.nextLine();
                this.bookcase.get(idNew).remove(2);
                this.bookcase.get(idNew).listIterator(2).add(trocar);
                break;
            case "3":
                System.out.println("Digite o ano correto: ");
                trocar = this.scanner.nextLine();
                this.bookcase.get(idNew).remove(3);
                this.bookcase.get(idNew).listIterator(3).add(trocar);
                break;
        }

    }

    public void deleteBook() {
        int idNew;
        idNew = setId("Digite o livro a ser deletado: ");
        bookcase.remove(idNew);
        if (idNew < bookcase.size()) {
            for (int i = idNew; i <= (bookcase.size() - 1); i++) {
                bookcase.get(i).removeFirst();
                bookcase.get(i).listIterator(0).add(String.valueOf(i));
            }
        }
    }

    private int setId(String text) {
        String id;
        int idNew;
        System.out.println(text);
        id = scanner.nextLine();
        idNew = Integer.parseInt(id);
        return idNew;
    }
}

