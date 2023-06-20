package ar.com.byteBank.modelo;

import ar.com.byteBank.interfases.Autenticable;

public class Gerente extends Funcionario implements Autenticable {

    private AutenticacionUtil util;

    public Gerente() {
        this.util = new AutenticacionUtil();
    }

    // Sobre-escritura de metodo
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE GERENTE");
        return 2000;
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
