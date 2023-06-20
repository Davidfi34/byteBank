package ar.com.byteBank.tests;

import ar.com.byteBank.modelo.Funcionario;
import ar.com.byteBank.modelo.Gerente;

public class TestReferencias {

    public static void main(String[] args) {

        // Elemento mas generico puede ser adaptado
        //                     al elemento mas especifico
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        gerente.iniciarSesion("_ddddd");

    }

}