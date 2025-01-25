package Tests;

import main.EstanteCrud;

import java.util.Scanner;

public class EstanteCrudTest {
    public static void main(String[] args) {
        EstanteCrud biblioteca = new EstanteCrud();
        Scanner inpt = new Scanner(System.in);
        int opcaoEscolhida;
        do {
            System.out.println("------------------------------------------");
            System.out.println("Bem vindo a estante! \nOpções: \n[1]Adicionar um livro \n[2]Ver livros \n[3]Ver livro específico \n[4]Atualizar livro \n[5]Deletar \n[0]Sair");
            System.out.println("Digite sua escolha: ");
            opcaoEscolhida = inpt.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    biblioteca.setLivro();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    biblioteca.getLivros();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    biblioteca.getLivro();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    biblioteca.upLivro();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                case 5:
                    biblioteca.deleteLivro();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        } while (opcaoEscolhida != 0);
    }
}
