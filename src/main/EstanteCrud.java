package main;

import java.util.ArrayList;
import java.util.Scanner;

public class EstanteCrud {
    protected ArrayList<ArrayList<String>> estante = new ArrayList<>();

    protected Scanner scanner = new Scanner(System.in);

    public void setBook() {
        String nameBook;
        String nameActor;
        String year;
        String id;
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

        id = String.valueOf(this.estante.size());

        book.add(id);
        book.add(nameBook);
        book.add(nameActor);
        book.add(year);

        this.estante.add(book);
        System.out.println("Livro adicionado.");
        System.out.println("-----------------------------------------");
    }

    public void getBooks() {
        System.out.println("-----------------------------------------");
        System.out.println("Livros atuais: \n" + this.estante);
        System.out.println("-----------------------------------------");
    }

    public void getBook() {
        String id;
        int idNew;

        System.out.println("-----------------------------------------");
        System.out.println("Digite o id do livro: ");
        id = this.scanner.nextLine();
        System.out.println("-----------------------------------------");
        idNew = Integer.parseInt(id);

        String livro = String.valueOf(this.estante.get(idNew));
        System.out.println(livro);
        System.out.println("-----------------------------------------");
    }

    public void upBook() {
        String id;
        String escolha;
        String trocar;
        int idNew;

        System.out.println("-----------------------------------------");
        System.out.println("Digite o id do livro: ");
        id = scanner.nextLine();
        System.out.println("-----------------------------------------");

        System.out.println("O que deseja atualizar? \n[1] Nome do livro \n[2]Autor \n[3]Ano \n[0]Cancelar atualização");
        escolha = this.scanner.nextLine();

        idNew = Integer.parseInt(id);

        switch (escolha) {
            case "0":
                break;
            case "1":
                System.out.println("Digite o novo nome do livro: ");
                trocar = this.scanner.nextLine();
                this.estante.get(idNew).remove(1);
                this.estante.get(idNew).listIterator(1).add(trocar);
            case "2":
                System.out.println("Digite autor corrigido: ");
                trocar = this.scanner.nextLine();
                this.estante.get(idNew).remove(2);
                this.estante.get(idNew).listIterator(2).add(trocar);
            case "3":
                System.out.println("Digite o ano correto: ");
                trocar = this.scanner.nextLine();
                this.estante.get(idNew).remove(3);
                this.estante.get(idNew).listIterator(3).add(trocar);
        }

    }

    public void deleteBook() {
        String id;
        int idNew;

        System.out.println("Digite o livro a ser deletado: ");
        id = scanner.nextLine();
        idNew = Integer.parseInt(id);
        estante.remove(idNew);
        if (idNew < estante.size()) {
            for (int i = idNew; i <= (estante.size() - 1); i++) {
                estante.get(i).removeFirst();
                estante.get(i).listIterator(0).add(String.valueOf(i));
            }
        }
    }
}

