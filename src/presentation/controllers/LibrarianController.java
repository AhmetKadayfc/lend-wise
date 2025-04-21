package presentation.controllers;

import entities.auth.Librarian;

import java.util.List;

public class LibrarianController extends Controller<Librarian> {
    @Override
    public List<Librarian> getAll() {
        return List.of();
    }

    @Override
    public Librarian getById(int id) {
        return null;
    }

    @Override
    public Librarian create(Librarian element) {
        return null;
    }

    @Override
    public Librarian update(Librarian element) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
