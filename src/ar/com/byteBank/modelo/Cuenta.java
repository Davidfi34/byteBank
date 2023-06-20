package ar.com.byteBank.modelo;


import ar.com.byteBank.exceptions.SaldoInsuficienteException;

/**
 *
 * Cuenta va a crear nuevas instancias de CuentaCorrientes o de CuentaAhorro
 *
 * @version 1.0
 * @author David Figuerero
 *
 */

public abstract class Cuenta {
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;


    /**
     *  Instancia una nueva cuenta sin paramentros
     */
    public Cuenta() {

    }

    /**
     * Instancia una nueva cuenta usando agencia y numero
     * @param agencia
     * @param numero
     */
    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }


    public abstract void deposita(double valor);


    /**
     *Este metodo retira dinera de la cuenta y si ocurre algun error,
     * devuelve una excepcion
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }


    /**
     * Transfiere dinero de la cuenta a otra
     * @param valor
     * @param destino
     * @return
     */

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            try {
                this.saca(valor);
            } catch (SaldoInsuficienteException e) {
                throw new RuntimeException(e);
            }
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }


}
