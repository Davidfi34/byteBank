package ar.com.byteBank.tests;

import ar.com.byteBank.exceptions.SaldoInsuficienteException;
import ar.com.byteBank.modelo.Cuenta;
import ar.com.byteBank.modelo.CuentaAhorros;

public class TestCuentaExceptionSaldo {

    public static void main(String[] args) {

        Cuenta ca = new CuentaAhorros( 120,22);
        ca.deposita(200);
        try {
            ca.saca(100);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }
    }
}
