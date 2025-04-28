package business;

import java.util.List;

public abstract class Service<T> {
    public abstract T getById(String id);
    public abstract List<T> getAll();
    public abstract void create(T t);
    public abstract void update(T t);
    public abstract void delete(String id);
}
