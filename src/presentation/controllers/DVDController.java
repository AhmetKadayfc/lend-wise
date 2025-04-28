package presentation.controllers;

import business.DVDService;
import entities.items.DVD;

import java.util.Scanner;

public class DVDController extends Controller<DVD> {

    public DVDController(Scanner scanner) {
        super(scanner, new DVDService());
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
