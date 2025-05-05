package business;

import dal.BookManager;
import entities.items.Book;
import java.util.List;

public class BookService extends Service<Book>{
    public BookService() {
        super(new BookManager());
    }

    @Override
    public Book getById(String id) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return List.of();
    }

    @Override
    public void create(Book book) {}

    @Override
    public void update(Book book) {}

    @Override
    public void delete(String id) {}
}
