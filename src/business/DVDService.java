package business;

import dal.DVDManager;
import entities.items.DVD;

import java.util.List;

public class DVDService  extends Service<DVD>{

    public DVDService() {
        super(new DVDManager());
    }

    @Override
    public DVD getById(String id) {
        return null;
    }

    @Override
    public List<DVD> getAll() {
        return List.of();
    }

    @Override
    public void create(DVD dvd) {

    }

    @Override
    public void update(DVD dvd) {

    }

    @Override
    public void delete(String id) {

    }
}
