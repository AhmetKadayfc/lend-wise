package business;

import dal.LibrarianManager;
import entities.auth.Librarian;

import java.util.List;

public class LibrarianService extends Service<Librarian> {

    public LibrarianService() {
        super(new LibrarianManager());
    }

    @Override
    public Librarian getById(String id) {
        return null;
    }

    @Override
    public List<Librarian> getAll() {
        return List.of();
    }

    @Override
    public void create(Librarian librarian) {

    }

    @Override
    public void update(Librarian librarian) {

    }

    @Override
    public void delete(String id) {

    }
}
