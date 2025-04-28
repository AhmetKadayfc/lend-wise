package presentation.controllers;

import business.Service;
import java.util.Scanner;

public abstract class Controller<T>{
    protected Scanner scanner;
    protected Service<T> service;

    public Controller(Scanner scanner, Service<T> service) {
        this.scanner = scanner;
        this.service = service;
    }

    public abstract void getAll();
    public abstract void getById();

    public abstract void create();
    public abstract void update();
    public abstract void delete();
}

