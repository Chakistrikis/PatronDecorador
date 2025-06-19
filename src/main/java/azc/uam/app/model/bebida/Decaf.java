package azc.uam.app.model.bebida;

import azc.uam.app.model.Bebida;

public class Decaf extends Bebida {
    public Decaf(){
        description = "Decaf";
        costo = (float) 14.00;
    }

    @Override
    public float getCosto() {
        return super.getCosto();
    }
}
