package ar.com.byteBank.exceptions;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}