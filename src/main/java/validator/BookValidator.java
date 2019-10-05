package validator;

public class BookValidator {
    private BookValidator() {
    }

    public static boolean isCorrectNumber(int num) {
        return (num > -1);
    }
}
