package azc.uam.app.controller;

import azc.uam.app.model.Bebida;
import azc.uam.app.model.bebida.Decaf;
import azc.uam.app.model.bebida.Expreso;
import azc.uam.app.model.bebida.MezclaCasa;
import azc.uam.app.model.bebida.TostadoFuerte;
import azc.uam.app.model.condimento.CremaBatida;
import azc.uam.app.model.condimento.Leche;
import azc.uam.app.model.condimento.Moca;
import azc.uam.app.model.condimento.Soya;
import azc.uam.app.view.VistaBebida;

import java.util.ArrayList;
import java.util.List;

public class ControladorBebida {
    private VistaBebida vistaBebida;
    private List<Bebida> pedidos;
    private Bebida bebidaActual;

    public ControladorBebida(VistaBebida vistaBebida){
        this.vistaBebida = vistaBebida;
        this.pedidos = new ArrayList<>();
    }

    public void iniciar(){
        boolean terminarPedido = false;

        while (!terminarPedido){
            vistaBebida.mostrarMenu();
            int opcion = vistaBebida.obtenerSeleccion();
            switch (opcion){
                case 1 -> {
                    bebidaActual = new Expreso();
                    agregarCondimentos();
                }
                case 2 -> {
                    bebidaActual = new Decaf();
                    agregarCondimentos();
                }
                case 3 -> {
                    bebidaActual = new MezclaCasa();
                    agregarCondimentos();
                }
                case 4 -> {
                    bebidaActual = new TostadoFuerte();
                    agregarCondimentos();
                }
                case 5 -> terminarPedido = true;
                default -> vistaBebida.mostrarMensaje("Seleccion no valida.");
            }
        }

        if (!pedidos.isEmpty()){
            vistaBebida.mostrarPedidoFinal(pedidos);
        }
        else{
            vistaBebida.mostrarMensaje("No hay ningun pedido activo.");
        }
    }

    private void agregarCondimentos(){
        boolean terminarCondimentos = false;
        while (!terminarCondimentos){
            vistaBebida.limpiarPantalla();
            vistaBebida.mostrarPedidoActual(bebidaActual);
            vistaBebida.mostrarCondimentos();
            int opcion = vistaBebida.obtenerSeleccion();
            switch(opcion){
                case 1 -> bebidaActual = new Leche(bebidaActual);
                case 2 -> bebidaActual = new Moca(bebidaActual);
                case 3 -> bebidaActual = new Soya(bebidaActual);
                case 4 -> bebidaActual = new CremaBatida(bebidaActual);
                case 5 -> terminarCondimentos = true;
                default -> vistaBebida.mostrarMensaje("Selelecciona la opcion correcta.");
            }
            vistaBebida.mostrarMensaje("Bebida agregada al pedido.");
        }
        pedidos.add(bebidaActual);

    }
}
