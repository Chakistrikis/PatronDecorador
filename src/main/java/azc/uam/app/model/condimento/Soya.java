package azc.uam.app.model.condimento;

import azc.uam.app.model.Bebida;

public class Soya extends DecoradorCondimento{
    public Soya(Bebida bebida){
        super(bebida);
    }
    @Override
    public float getCosto() {
        return (float) (bebida.getCosto() + 2.00);
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + ", Soya";
    }
}
