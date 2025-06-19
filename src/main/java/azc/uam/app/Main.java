package azc.uam.app;

import azc.uam.app.controller.ControladorBebida;
import azc.uam.app.view.VistaBebida;


/**
 * @author Christian Aguilera - UAM Azcapotzalco
 */
public class Main {
    public static void main(String[] args) {
        VistaBebida vistaBebida = new VistaBebida();
        ControladorBebida controladorBebida = new ControladorBebida(vistaBebida);
        controladorBebida.iniciar();
    }
}