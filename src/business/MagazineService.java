package business;

import dal.MagazineManager;
import entities.items.Magazine;

import java.util.List;

public class MagazineService extends Service<Magazine> {

    public MagazineService() {
        super(new MagazineManager());
    }

    @Override
    public Magazine getById(String id) {
        return null;
    }

    @Override
    public List<Magazine> getAll() {
        return List.of();
    }

    @Override
    public void create(Magazine magazine) {

    }

    @Override
    public void update(Magazine magazine) {

    }

    @Override
    public void delete(String id) {

    }
}
