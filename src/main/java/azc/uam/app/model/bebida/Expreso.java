package azc.uam.app.model.bebida;

import azc.uam.app.model.Bebida;

public class Expreso extends Bebida {
    public Expreso(){
        description = "Expreso";
        costo = (float) 10.50;
    }

    @Override
    public float getCosto() {
        return super.getCosto();
    }
}
