package com.example.exceptions311;

public class ZeroDenumException extends Exception {

    public ZeroDenumException(String message) {
        //кастомное сообщение - делать необзательно
        super(message);
    }
    public ZeroDenumException() {
        super("Знаменатель не может быть равен 0");
    }
}
