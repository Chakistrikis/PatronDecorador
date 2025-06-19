package azc.uam.app.model.condimento;

import azc.uam.app.model.Bebida;

public class Leche extends DecoradorCondimento{
    public Leche(Bebida bebida){
        super(bebida);
    }

    @Override
    public float getCosto() {
        return (float) (bebida.getCosto() + 1.00);
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + ", Leche";
    }
}
