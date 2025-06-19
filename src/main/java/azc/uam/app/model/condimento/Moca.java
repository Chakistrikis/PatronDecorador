package azc.uam.app.model.condimento;

import azc.uam.app.model.Bebida;

public class Moca extends DecoradorCondimento{

    public Moca(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + ", Moca";
    }

    @Override
    public float getCosto() {
        return (float) (bebida.getCosto() + 1.00);
    }
}
