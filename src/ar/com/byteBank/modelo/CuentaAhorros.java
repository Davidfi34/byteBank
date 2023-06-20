package ar.com.byteBank.modelo;

import ar.com.byteBank.exceptions.SaldoInsuficienteException;

public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double comision = 0.2;
        super.saca(valor + comision);
        //System.out.println("saldo actual $"+this.saldo);
    }

}
