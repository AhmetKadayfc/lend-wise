package presentation.controllers;

import business.DirectorService;
import entities.auth.Director;

import java.util.Scanner;

public class DirectorController extends Controller<Director> {

    public DirectorController(Scanner scanner) {
        super(scanner, new DirectorService());
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
