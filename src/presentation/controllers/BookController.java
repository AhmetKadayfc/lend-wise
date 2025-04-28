package presentation.controllers;

import business.BookService;
import entities.items.Book;

import java.util.Scanner;

public class BookController extends Controller<Book> {

    public BookController(Scanner scanner) {
        super(scanner, new BookService());
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
