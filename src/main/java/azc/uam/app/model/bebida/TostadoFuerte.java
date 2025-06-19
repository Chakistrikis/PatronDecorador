package azc.uam.app.model.bebida;

import azc.uam.app.model.Bebida;

public class TostadoFuerte extends Bebida {
    public TostadoFuerte(){
        description = "Tostado Fuerte";
        costo = (float) 15.99;
    }

    @Override
    public float getCosto() {
        return super.getCosto();
    }
}
