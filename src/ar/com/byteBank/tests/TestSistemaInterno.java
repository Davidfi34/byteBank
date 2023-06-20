package ar.com.byteBank.tests;

import ar.com.byteBank.interfases.Autenticable;
import ar.com.byteBank.modelo.Administrador;
import ar.com.byteBank.modelo.Gerente;
import ar.com.byteBank.modelo.SistemaInterno;

public class TestSistemaInterno {

    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();

        Gerente david = new Gerente();
        Administrador admin = new Administrador();

        admin.setClave("");
        david.setClave("AluraCursosOnLine");

        sistema.autentica(david);
        sistema.autentica(admin);


    }
}
