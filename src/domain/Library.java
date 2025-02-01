package domain;

import java.util.ArrayList;

public class Library extends EstanteCrud {
    protected ArrayList<ArrayList<ArrayList<String>>> shelves = new ArrayList<>();

    protected EstanteCrud estanteCrud = new EstanteCrud();

    public void setBookcase(EstanteCrud estanteCrud) {
        ArrayList<ArrayList<String>> lista = estanteCrud.getBooks();
        int id = shelves.size();
        if (id == 0){
            this.shelves.addFirst(lista);
        } else {
            this.shelves.add(id, lista);
        }
    }

    protected ArrayList<ArrayList<String>> getBookcase(int id, EstanteCrud estanteCrud){
        return this.shelves.get(id);
    }

    public void getIdBookcase(EstanteCrud estanteCrud, int id) {
        System.out.println(this.shelves.get(id));
    }

    public void getShelves(EstanteCrud estanteCrud) {
        for (int i = 0; i < (this.shelves.size() - 1); i++) {
            for (ArrayList<String> bookcase : this.shelves.get(i)) {
                System.out.println(bookcase);
            }
        }
    }
}
