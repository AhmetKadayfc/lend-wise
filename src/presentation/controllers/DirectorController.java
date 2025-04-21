package presentation.controllers;

import entities.auth.Director;

import java.util.List;

public class DirectorController extends Controller<Director> {
    @Override
    public List<Director> getAll() {
        return List.of();
    }

    @Override
    public Director getById(int id) {
        return null;
    }

    @Override
    public Director create(Director element) {
        return null;
    }

    @Override
    public Director update(Director element) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
