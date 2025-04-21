package presentation.controllers;

import entities.items.Magazine;

import java.util.List;

public class MagazineController extends Controller<Magazine> {
    @Override
    public List<Magazine> getAll() {
        return List.of();
    }

    @Override
    public Magazine getById(int id) {
        return null;
    }

    @Override
    public Magazine create(Magazine element) {
        return null;
    }

    @Override
    public Magazine update(Magazine element) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
