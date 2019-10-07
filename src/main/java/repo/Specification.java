package repo;

/**
 * The interface Specification.
 *
 * @param <T> the type parameter
 */
public interface Specification <T> {
    /**
     * Match boolean.
     *
     * @param bean the bean
     * @return the boolean
     */
    boolean match(T bean);
}
