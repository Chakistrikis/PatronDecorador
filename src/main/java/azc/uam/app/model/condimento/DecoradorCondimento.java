package azc.uam.app.model.condimento;

import azc.uam.app.model.Bebida;

public abstract class DecoradorCondimento extends Bebida {
    protected Bebida bebida;
    protected String descripcion;

    public DecoradorCondimento(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
