package main;

import java.util.ArrayList;
import java.util.Scanner;

public class EstanteCrud {
    protected ArrayList<ArrayList<String>> estante = new ArrayList<>();

    protected Scanner inpt = new Scanner(System.in);

    public void setLivro() {
        String nomeLivro;
        String nomeAutor;
        String ano;
        String id;
        ArrayList<String> livro = new ArrayList<>();

        System.out.println("-----------------------------------------");
        System.out.println("Nome do livro: ");
        nomeLivro = this.inpt.nextLine();
        System.out.println("-----------------------------------------");

        System.out.println("Autor(a): ");
        nomeAutor = this.inpt.nextLine();
        System.out.println("-----------------------------------------");

        System.out.println("Ano: ");
        ano = this.inpt.nextLine();
        System.out.println("-----------------------------------------");

        id = String.valueOf(this.estante.size());

        livro.add(id);
        livro.add(nomeLivro);
        livro.add(nomeAutor);
        livro.add(ano);

        this.estante.add(livro);
        System.out.println("Livro adicionado.");
        System.out.println("-----------------------------------------");
    }

    public void getLivros() {
        System.out.println("-----------------------------------------");
        System.out.println("Livros atuais: \n" + this.estante);
        System.out.println("-----------------------------------------");
    }

    public void getLivro() {
        int id;

        System.out.println("-----------------------------------------");
        System.out.println("Digite o id do livro: ");
        id = this.inpt.nextInt();
        System.out.println("-----------------------------------------");
        String livro = String.valueOf(this.estante.get(id));
        System.out.println(livro);
        System.out.println("-----------------------------------------");
    }

    public void upLivro() {
        String id;
        String escolha;
        String trocar;
        int idnew;

        System.out.println("-----------------------------------------");
        System.out.println("Digite o id do livro: ");
        id = inpt.nextLine();
        System.out.println("-----------------------------------------");

        System.out.println("O que deseja atualizar? \n[1] Nome do livro \n[2]Autor \n[3]Ano \n[0]Cancelar atualização");
        escolha = this.inpt.nextLine();

        idnew = Integer.parseInt(id);

        switch (escolha) {
            case "0":
                break;
            case "1":
                System.out.println("Digite o novo nome do livro: ");
                trocar = this.inpt.nextLine();
                this.estante.get(idnew).remove(1);
                this.estante.get(idnew).listIterator(1).add(trocar);
            case "2":
                System.out.println("Digite autor corrigido: ");
                trocar = this.inpt.nextLine();
                this.estante.get(idnew).remove(2);
                this.estante.get(idnew).listIterator(2).add(trocar);
            case "3":
                System.out.println("Digite o ano correto: ");
                trocar = this.inpt.nextLine();
                this.estante.get(idnew).remove(3);
                this.estante.get(idnew).listIterator(3).add(trocar);
        }

    }

    public void deleteLivro() {
        String id;
        int idnew;

        System.out.println("Digite o livro a ser deletado: ");
        id = inpt.nextLine();
        idnew = Integer.parseInt(id);
        estante.remove(idnew);
        if (idnew < estante.size()) {
            for (int i = idnew; i <= (estante.size() - 1); i++) {
                estante.get(i).remove(0);
                estante.get(i).listIterator(0).add(String.valueOf(i));
            }
        }
    }
}

