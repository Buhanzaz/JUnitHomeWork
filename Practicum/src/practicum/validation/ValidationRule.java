package practicum.validation;

// Дополните базовый класс для всех правил валидации
public abstract class ValidationRule<Type> {
    protected final Type value;
    private final String errorMessage;

    protected ValidationRule(Type value, String errorMessage) {
        this.value = value;
        this.errorMessage = errorMessage;
    }


    public abstract boolean isValid();

    public String getErrorMessage() {
        return errorMessage;
    }
}