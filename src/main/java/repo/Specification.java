package repo;

public interface Specification <T> {
    boolean match(T bean);
}
