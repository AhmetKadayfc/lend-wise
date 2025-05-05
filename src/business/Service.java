package business;

import dal.Manager;

import java.util.List;

public abstract class Service<T> {
    protected final Manager<T> manager;

    public Service(Manager<T> manager) {
        this.manager = manager;
    }

    public abstract T getById(String id);
    public abstract List<T> getAll();
    public abstract void create(T t);
    public abstract void update(T t);
    public abstract void delete(String id);
}
