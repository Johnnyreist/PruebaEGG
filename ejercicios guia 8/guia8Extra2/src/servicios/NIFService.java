
package servicios;

import entidades.NIF;


public class NIFService {
    public static void main(String[] args) {
        NIF nif1 = new NIF(395469L);
        nif1.mostrar();  // Debería imprimir "00395469-F"

        NIF nif2 = new NIF();
        nif2.crearNif();
        nif2.mostrar();
    }
}