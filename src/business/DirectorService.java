package business;

import dal.DirectorManager;
import entities.auth.Director;

import java.util.List;

public class DirectorService extends Service<Director> {

    public DirectorService() {
        super(new DirectorManager());
    }

    @Override
    public Director getById(String id) {
        return null;
    }

    @Override
    public List<Director> getAll() {
        return List.of();
    }

    @Override
    public void create(Director director) {

    }

    @Override
    public void update(Director director) {

    }

    @Override
    public void delete(String id) {

    }
}
