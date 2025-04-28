package presentation.controllers;

import business.LibrarianService;
import entities.auth.Librarian;

import java.util.Scanner;

public class LibrarianController extends Controller<Librarian> {

    public LibrarianController(Scanner scanner) {
        super(scanner, new LibrarianService());
    }

    @Override
    public void getAll() {}

    @Override
    public void getById() {}

    @Override
    public void create() {}

    @Override
    public void update() {}

    @Override
    public void delete() {}
}
