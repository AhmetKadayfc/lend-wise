package presentation.controllers;

import entities.items.DVD;

import java.util.List;

public class DVDController extends Controller<DVD> {
    @Override
    public List<DVD> getAll() {
        return List.of();
    }

    @Override
    public DVD getById(int id) {
        return null;
    }

    @Override
    public DVD create(DVD element) {
        return null;
    }

    @Override
    public DVD update(DVD element) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
