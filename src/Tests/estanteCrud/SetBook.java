package Tests.estanteCrud;

import domain.EstanteCrud;
/**Esta classe testa o método adicionar um ou mais livros
* e o de mostrar os livros*/
public class SetBook {
    public static void main(String[] args) {
        EstanteCrud estanteCrud = new EstanteCrud();

        estanteCrud.setBook();
        estanteCrud.getBooks();

    }
}
