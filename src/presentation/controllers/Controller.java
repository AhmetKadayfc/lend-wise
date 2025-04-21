package presentation.controllers;

public abstract class Controller<T>{
    public abstract void getAll();
    public abstract void getById();

    public abstract void create();
    public abstract void update();
    public abstract void delete();
}

