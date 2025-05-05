package dal;

public abstract class Manager<T> {
    protected final String FILE_NAME;

    public Manager(String fileName) {
        FILE_NAME = fileName;
    }

    public abstract void getById(String id);
    public abstract void getAll();
    public abstract void create(T entity);
    public abstract void update(T entity);
    public abstract void delete(String id);
}
