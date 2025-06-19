package azc.uam.app.view;

import azc.uam.app.model.Bebida;

import java.util.List;
import java.util.Scanner;

public class VistaBebida {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("===================== CAFETERIA =======================");
        System.out.println(" 1 - Expreso ($10.50)");
        System.out.println(" 2 - Decaf ($14.00)");
        System.out.println(" 3 - Mezcla de la Casa ($9.50)");
        System.out.println(" 4 - Tostado Fuerte ($15.99)");
        System.out.println(" 5 - Finalizar Pedido.");
    }

    public void mostrarCondimentos(){
        System.out.println("===================== CONDIMENTOS =======================");
        System.out.println(" 1 - Leche ($1)");
        System.out.println(" 2 - Moca ($1)");
        System.out.println(" 3 - Soya ($2)");
        System.out.println(" 4 - Crema Batida ($1)");
        System.out.println(" 5 - Continuar");
    }

    public int obtenerSeleccion(){
        return scanner.nextInt();
    }

    public void mostrarPedidoActual(Bebida bebida){
        System.out.println("Pedido actual: \n " +
                bebida.getDescription());
        System.out.println("Costo total: $" + bebida.getCosto());
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }


    public void mostrarPedidoFinal(List<Bebida> pedidos) {
        System.out.println("------ PEDIDO FINAL -------");
        float total = 0;
        for (Bebida bebida: pedidos){
            System.out.println("---------------------------");
            System.out.println(bebida.getDescription() + ".....................$" + bebida.getCosto());
            System.out.println();
            total = total + bebida.getCosto();
        }
        System.out.println("Total a Pagar: $" + total);
    }

    public void limpiarPantalla() {
        for (int i = 0; i < 5; i++){
            System.out.println("\n");
        }
    }
}
