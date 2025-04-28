package presentation.controllers;

import business.MagazineService;
import entities.items.Magazine;

import java.util.Scanner;

public class MagazineController extends Controller<Magazine> {

    public MagazineController(Scanner scanner) {
        super(scanner, new MagazineService());
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
