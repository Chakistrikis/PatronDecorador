package azc.uam.app.model.bebida;

import azc.uam.app.model.Bebida;

public class MezclaCasa extends Bebida {
    public MezclaCasa(){
        description = "Mezcla Casa";
        costo = (float) 9.50;
    }

    @Override
    public float getCosto() {
        return super.getCosto();
    }
}
