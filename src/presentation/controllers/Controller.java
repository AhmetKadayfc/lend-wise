package presentation.controllers;

import java.util.List;

public abstract class Controller<T>{
    public abstract List<T> getAll();
    public abstract T getById(int id);

    public abstract T create(T element);
    public abstract T update(T element);
    public abstract void delete(int id);
}

