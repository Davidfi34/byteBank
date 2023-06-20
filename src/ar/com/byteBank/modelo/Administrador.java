package ar.com.byteBank.modelo;

import ar.com.byteBank.interfases.Autenticable;

public class Administrador extends Funcionario implements Autenticable {

    private AutenticacionUtil util;

    public Administrador() {
        this.util = new AutenticacionUtil();
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
       // System.out.println("la clave es: "+clave);

        return this.util.iniciarSesion(clave);
    }

}