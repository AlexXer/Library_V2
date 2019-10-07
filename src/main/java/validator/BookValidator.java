package validator;

/**
 * The type Book validator.
 */
public class BookValidator {
    private BookValidator() {
    }

    /**
     * Is correct number boolean.
     *
     * @param num the num
     * @return the boolean
     */
    public static boolean isCorrectNumber(int num) {
        return (num > -1);
    }
}
