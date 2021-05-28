package EjerciciosClase;

import TareaBuilder.BuilderPizza;

public class Bife extends BuilderParrilla {

    @Override
    public void buildTipoDeCarne() { parrillas.setTipoDeCarne("Bife");

    }

    @Override
    public void buildSaborRefresco() {parrillas.setSaborRefresco("coca cola");

    }

    @Override
    public void buildGuarniciones() {parrillas.setGuarniciones("papas fritas");

    }
}
