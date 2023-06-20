package ar.com.byteBank.tests;

import ar.com.byteBank.modelo.Contador;
import ar.com.byteBank.modelo.ControlBonificacion;
import ar.com.byteBank.modelo.Funcionario;
import ar.com.byteBank.modelo.Gerente;

public class TestControlBonificacion {

    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000);

        Contador alexiz = new Contador();
        alexiz.setSalario(5000);

        ControlBonificacion controlBonificacion =
                new ControlBonificacion();

        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alexiz);
    }

}