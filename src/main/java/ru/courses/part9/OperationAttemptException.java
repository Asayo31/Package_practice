package ru.courses.part9;

public class OperationAttemptException extends Exception {

    // Конструктор без параметров
    public OperationAttemptException() {
        super();
    }

    // Конструктор с сообщением об ошибке
    public OperationAttemptException(String message) {
        super(message);
    }

    // Конструктор с сообщением об ошибке и причиной исключения
    public OperationAttemptException(String message, Throwable cause) {
        super(message, cause);
    }

    // Конструктор с причиной исключения
    public OperationAttemptException(Throwable cause) {
        super(cause);
    }

    // Конструктор с дополнительными флагами для управления стеком и трассировкой
    protected OperationAttemptException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
